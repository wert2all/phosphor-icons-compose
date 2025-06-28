package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CaretDoubleLeftFill: ImageVector
    get() {
        if (_CaretDoubleLeftFill != null) {
            return _CaretDoubleLeftFill!!
        }
        _CaretDoubleLeftFill =
            ImageVector
                .Builder(
                    name = "CaretDoubleLeftFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(203.06f, 40.61f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.72f, 1.73f)
                        lineTo(128f, 108.69f)
                        verticalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.66f, -5.66f)
                        lineToRelative(-80f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.32f)
                        lineToRelative(80f, 80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 208f)
                        verticalLineTo(147.31f)
                        lineToRelative(66.34f, 66.35f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 208f)
                        verticalLineTo(48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 203.06f, 40.61f)
                        close()
                    }
                }.build()

        return _CaretDoubleLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleLeftFill: ImageVector? = null
