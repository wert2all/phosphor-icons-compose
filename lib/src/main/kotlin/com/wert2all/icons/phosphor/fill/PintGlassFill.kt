package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.PintGlassFill: ImageVector
    get() {
        if (_PintGlassFill != null) {
            return _PintGlassFill!!
        }
        _PintGlassFill =
            ImageVector
                .Builder(
                    name = "Fill.PintGlassFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(206f, 26.69f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                        horizontalLineTo(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.94f, 9f)
                        lineToRelative(23.15f, 193f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 87.1f, 240f)
                        horizontalLineToRelative(81.8f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.89f, -14.09f)
                        lineTo(207.94f, 33f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 206f, 26.69f)
                        close()
                        moveTo(191f, 40f)
                        lineTo(188.1f, 64f)
                        horizontalLineTo(67.9f)
                        lineTo(65f, 40f)
                        close()
                    }
                }.build()

        return _PintGlassFill!!
    }

@Suppress("ObjectPropertyName")
private var _PintGlassFill: ImageVector? = null
