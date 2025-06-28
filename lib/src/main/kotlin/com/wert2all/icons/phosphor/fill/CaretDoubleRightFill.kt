package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CaretDoubleRightFill: ImageVector
    get() {
        if (_CaretDoubleRightFill != null) {
            return _CaretDoubleRightFill!!
        }
        _CaretDoubleRightFill =
            ImageVector
                .Builder(
                    name = "CaretDoubleRightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(221.66f, 122.34f)
                        lineToRelative(-80f, -80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 48f)
                        verticalLineToRelative(60.69f)
                        lineTo(61.66f, 42.34f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
                        verticalLineTo(208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                        lineTo(128f, 147.31f)
                        verticalLineTo(208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                        lineToRelative(80f, -80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 221.66f, 122.34f)
                        close()
                    }
                }.build()

        return _CaretDoubleRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleRightFill: ImageVector? = null
