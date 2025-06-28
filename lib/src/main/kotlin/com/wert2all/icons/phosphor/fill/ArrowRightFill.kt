package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowRightFill: ImageVector
    get() {
        if (_ArrowRightFill != null) {
            return _ArrowRightFill!!
        }
        _ArrowRightFill =
            ImageVector
                .Builder(
                    name = "ArrowRightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(221.66f, 133.66f)
                        lineToRelative(-72f, 72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 200f)
                        verticalLineTo(136f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(96f)
                        verticalLineTo(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                        lineToRelative(72f, 72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 221.66f, 133.66f)
                        close()
                    }
                }.build()

        return _ArrowRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightFill: ImageVector? = null
