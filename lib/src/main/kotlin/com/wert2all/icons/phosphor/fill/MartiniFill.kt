package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.MartiniFill: ImageVector
    get() {
        if (_MartiniFill != null) {
            return _MartiniFill!!
        }
        _MartiniFill =
            ImageVector
                .Builder(
                    name = "MartiniFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(237.66f, 45.66f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 32f)
                        lineTo(24f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                        lineTo(120f, 147.31f)
                        lineTo(120f, 208f)
                        lineTo(88f, 208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                        lineTo(136f, 208f)
                        lineTo(136f, 147.31f)
                        close()
                        moveTo(212.66f, 48f)
                        lineTo(196.66f, 64f)
                        lineTo(59.31f, 64f)
                        lineToRelative(-16f, -16f)
                        close()
                    }
                }.build()

        return _MartiniFill!!
    }

@Suppress("ObjectPropertyName")
private var _MartiniFill: ImageVector? = null
