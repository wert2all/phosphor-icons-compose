package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowULeftUpFill: ImageVector
    get() {
        if (_ArrowULeftUpFill != null) {
            return _ArrowULeftUpFill!!
        }
        _ArrowULeftUpFill =
            ImageVector
                .Builder(
                    name = "ArrowULeftUpFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(208f, 80f)
                        verticalLineToRelative(88f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -128f, 0f)
                        verticalLineTo(88f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                        lineToRelative(48f, -48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                        lineToRelative(48f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 88f)
                        horizontalLineTo(96f)
                        verticalLineToRelative(80f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 0f)
                        verticalLineTo(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                    }
                }.build()

        return _ArrowULeftUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowULeftUpFill: ImageVector? = null
