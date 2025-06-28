package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CaretDoubleUpFill: ImageVector
    get() {
        if (_CaretDoubleUpFill != null) {
            return _CaretDoubleUpFill!!
        }
        _CaretDoubleUpFill =
            ImageVector
                .Builder(
                    name = "CaretDoubleUpFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(147.31f, 128f)
                        horizontalLineTo(208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
                        lineToRelative(-80f, -80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                        lineToRelative(-80f, 80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 128f)
                        horizontalLineToRelative(60.69f)
                        lineTo(42.34f, 194.34f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 208f)
                        horizontalLineTo(208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
                        close()
                    }
                }.build()

        return _CaretDoubleUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleUpFill: ImageVector? = null
