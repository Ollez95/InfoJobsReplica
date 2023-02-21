package com.example.infojobsreplicajetpackcompose.features.mis_ofertas.model

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.infojobsreplicajetpackcompose.ui.theme.Typography


interface CVNoGuardadosI {
    val imageSize: Dp
    val firstText: TextUnit
    val secondText: TextUnit
}

class CVNoGuardadosCompact(
    override val imageSize: Dp = 150.dp,
    override val firstText: TextUnit = Typography.h6.fontSize,
    override val secondText: TextUnit = Typography.body2.fontSize
) : CVNoGuardadosI

class CVNoGuardadosMedium(
    override val imageSize: Dp = 200.dp,
    override val firstText: TextUnit = Typography.h5.fontSize,
    override val secondText: TextUnit = Typography.body1.fontSize
) : CVNoGuardadosI

class CVNoGuardadosExpanded(
    override val imageSize: Dp = 400.dp,
    override val firstText: TextUnit = Typography.h3.fontSize,
    override val secondText: TextUnit = Typography.h6.fontSize
) : CVNoGuardadosI







