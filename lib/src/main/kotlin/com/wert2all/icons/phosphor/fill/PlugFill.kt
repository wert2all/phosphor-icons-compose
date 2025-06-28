package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.PlugFill: ImageVector
    get() {
        if (_PlugFill != null) {
            return _PlugFill!!
        }
        _PlugFill =
            ImageVector
                .Builder(
                    name = "PlugFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(237.66f, 77.66f)
                        lineTo(203.31f, 112f)
                        lineToRelative(26.35f, 26.34f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                        lineTo(212f, 143.31f)
                        lineToRelative(-53f, 53f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56.57f, 0f)
                        lineTo(86.75f, 180.57f)
                        lineTo(37.66f, 229.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                        lineToRelative(49.09f, -49.09f)
                        lineTo(59.72f, 153.54f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -56.57f)
                        lineToRelative(53f, -53f)
                        lineToRelative(-6.35f, -6.34f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                        lineTo(144f, 52.69f)
                        lineToRelative(34.34f, -34.35f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, 11.32f)
                        lineTo(155.31f, 64f)
                        lineTo(192f, 100.69f)
                        lineToRelative(34.34f, -34.35f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                        close()
                    }
                }.build()

        return _PlugFill!!
    }

@Suppress("ObjectPropertyName")
private var _PlugFill: ImageVector? = null
