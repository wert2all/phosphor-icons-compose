package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowElbowLeftUpFill: ImageVector
    get() {
        if (_ArrowElbowLeftUpFill != null) {
            return _ArrowElbowLeftUpFill!!
        }
        _ArrowElbowLeftUpFill =
            ImageVector
                .Builder(
                    name = "ArrowElbowLeftUpFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(240f, 192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(104f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                        lineToRelative(48f, -48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                        lineToRelative(48f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 104f)
                        horizontalLineTo(96f)
                        verticalLineToRelative(80f)
                        horizontalLineTo(232f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 192f)
                        close()
                    }
                }.build()

        return _ArrowElbowLeftUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowLeftUpFill: ImageVector? = null
