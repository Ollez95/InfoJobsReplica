package com.example.infojobsreplicajetpackcompose.features.mis_ofertas.view.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.infojobsreplicajetpackcompose.features.mis_ofertas.utils.TabOptions
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CVTabLayout(
    candidaturasScreen: @Composable () -> Unit,
    guardadasScreen: @Composable () -> Unit

) {

    val pagerState = rememberPagerState(pageCount = 2)

    Column {

        // on below line we are calling tabs
        CVTabs(pagerState = pagerState)
        // on below line we are calling tabs content
        // for displaying our page for each tab layout
        CVTabsContent(
            pagerState = pagerState,
            candidaturasScreen = candidaturasScreen,
            guardadasScreen = guardadasScreen)
    }
}

@ExperimentalPagerApi
@Composable
fun CVTabs(pagerState: PagerState) {

    val scope = rememberCoroutineScope()
    TabRow(
        selectedTabIndex = pagerState.currentPage,

        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 2.dp
            )
        }
    ) {
        TabOptions.values().forEach { option ->
            Tab(
                text = {
                    Text(
                        text = option.name,
                        color = if (pagerState.currentPage == option.ordinal) Color.White else Color.Gray
                    )
                },
                selected = pagerState.currentPage == option.ordinal,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(option.ordinal)
                    }
                }
            )
        }
    }
}


@ExperimentalPagerApi
@Composable
fun CVTabsContent(
    pagerState: PagerState,
    candidaturasScreen: @Composable () -> Unit,
    guardadasScreen: @Composable () -> Unit) {
    HorizontalPager(state = pagerState) { page ->
        when (TabOptions.values()[page]) {
            TabOptions.CANDIDATURAS -> { candidaturasScreen() }
            TabOptions.GUARDADAS -> { guardadasScreen() }
        }
    }
}



@Preview
@Composable
fun CVTabLayoutPreview() {
    CVTabLayout(
        candidaturasScreen = { Text("test1") },
        guardadasScreen = { Text("test2") }
    )
}



