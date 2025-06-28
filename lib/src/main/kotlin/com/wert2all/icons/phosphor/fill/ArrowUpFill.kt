package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowUpFill: ImageVector
    get() {
        if (_ArrowUpFill != null) {
            return _ArrowUpFill!!
        }
        _ArrowUpFill =
            ImageVector
                .Builder(
                    name = "ArrowUpFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(207.39f, 115.06f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 120f)
                        horizontalLineTo(136f)
                        verticalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(120f)
                        horizontalLineTo(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                        lineToRelative(72f, -72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                        lineToRelative(72f, 72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 207.39f, 115.06f)
                        close()
                    }
                }.build()

        return _ArrowUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpFill: ImageVector? = null
