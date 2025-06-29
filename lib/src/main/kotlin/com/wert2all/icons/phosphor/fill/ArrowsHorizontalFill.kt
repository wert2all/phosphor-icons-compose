package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowsHorizontalFill: ImageVector
    get() {
        if (_ArrowsHorizontalFill != null) {
            return _ArrowsHorizontalFill!!
        }
        _ArrowsHorizontalFill =
            ImageVector
                .Builder(
                    name = "ArrowsHorizontalFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(237.66f, 133.66f)
                        lineToRelative(-32f, 32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 160f)
                        verticalLineTo(136f)
                        horizontalLineTo(64f)
                        verticalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                        lineToRelative(-32f, -32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                        lineToRelative(32f, -32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 96f)
                        verticalLineToRelative(24f)
                        horizontalLineTo(192f)
                        verticalLineTo(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                        lineToRelative(32f, 32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 237.66f, 133.66f)
                        close()
                    }
                }.build()

        return _ArrowsHorizontalFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsHorizontalFill: ImageVector? = null
