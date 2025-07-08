package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.CaretDownFill: ImageVector
    get() {
        if (_CaretDownFill != null) {
            return _CaretDownFill!!
        }
        _CaretDownFill =
            ImageVector
                .Builder(
                    name = "Fill.CaretDownFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(215.39f, 92.94f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 88f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                        lineToRelative(80f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 0f)
                        lineToRelative(80f, -80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.39f, 92.94f)
                        close()
                    }
                }.build()

        return _CaretDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDownFill: ImageVector? = null
