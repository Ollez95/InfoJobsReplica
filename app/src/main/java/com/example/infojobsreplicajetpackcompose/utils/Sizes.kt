package com.example.infojobsreplicajetpackcompose.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun rememberWindowInfo() : WindowInfo {
    val configuration = LocalConfiguration.current
    return WindowInfo(
        screenWidthInfo = when {
            configuration.screenWidthDp < 600 -> WindowInfo.WindowType.Compact
            configuration.screenWidthDp < 840 -> WindowInfo.WindowType.Medium
            else -> WindowInfo.WindowType.Expanded
        },
        screenHeightInfo = when {
            configuration.screenHeightDp < 480 -> WindowInfo.WindowType.Compact
            configuration.screenHeightDp < 900 -> WindowInfo.WindowType.Medium
            else -> WindowInfo.WindowType.Expanded
        },
        screenWidth = configuration.screenWidthDp.dp,
        screenHeight = configuration.screenHeightDp.dp
    )
}

data class WindowInfo(
    val screenWidthInfo: WindowType,
    val screenHeightInfo: WindowType,
    val screenWidth: Dp,
    val screenHeight: Dp
){
    sealed class WindowType {
        object Compact: WindowType()
        object Medium: WindowType()
        object Expanded: WindowType()
    }
}


fun <T> getWindowSizes(
    Compact: T,
    Medium: T,
    Expanded: T,
    windowInfo: WindowInfo.WindowType): T {
    return when (windowInfo) {
        WindowInfo.WindowType.Compact -> {
            // Create an instance of the data class with the desired parameters
            Compact as T // Cast the instance to the generic type parameter
        }
        WindowInfo.WindowType.Medium -> {
            // Create an instance of a different data class with different parameters
            Medium as T // Cast the instance to the generic type parameter
        }
        WindowInfo.WindowType.Expanded -> {
            // Create an instance of another data class with other parameters
            Expanded as T // Cast the instance to the generic type parameter
        }
    }
}

