package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.EscalatorDownFill: ImageVector
    get() {
        if (_EscalatorDownFill != null) {
            return _EscalatorDownFill!!
        }
        _EscalatorDownFill =
            ImageVector
                .Builder(
                    name = "EscalatorDownFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(170.34f, 85.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                        lineTo(192f, 84.69f)
                        verticalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        verticalLineTo(84.69f)
                        lineToRelative(10.34f, -10.35f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                        lineToRelative(-24f, 24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        close()
                        moveTo(224f, 144f)
                        horizontalLineTo(187.5f)
                        lineTo(93.88f, 42.57f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 40f)
                        horizontalLineTo(32f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 56f)
                        verticalLineTo(96f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineTo(68.5f)
                        lineToRelative(93.62f, 101.43f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 216f)
                        horizontalLineToRelative(56f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        verticalLineTo(160f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 144f)
                        close()
                    }
                }.build()

        return _EscalatorDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _EscalatorDownFill: ImageVector? = null
