package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ImageSquareFill: ImageVector
    get() {
        if (_ImageSquareFill != null) {
            return _ImageSquareFill!!
        }
        _ImageSquareFill =
            ImageVector
                .Builder(
                    name = "ImageSquareFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(208f, 32f)
                        horizontalLineTo(48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                        verticalLineTo(208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineTo(208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        verticalLineTo(48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                        close()
                        moveTo(48f, 48f)
                        horizontalLineTo(208f)
                        verticalLineToRelative(77.38f)
                        lineToRelative(-24.69f, -24.7f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.62f, 0f)
                        lineTo(53.37f, 208f)
                        horizontalLineTo(48f)
                        close()
                        moveTo(80f, 96f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 16f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 96f)
                        close()
                    }
                }.build()

        return _ImageSquareFill!!
    }

@Suppress("ObjectPropertyName")
private var _ImageSquareFill: ImageVector? = null
