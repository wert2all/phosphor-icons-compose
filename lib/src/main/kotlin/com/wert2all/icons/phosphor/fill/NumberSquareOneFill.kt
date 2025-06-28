package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.NumberSquareOneFill: ImageVector
    get() {
        if (_NumberSquareOneFill != null) {
            return _NumberSquareOneFill!!
        }
        _NumberSquareOneFill =
            ImageVector
                .Builder(
                    name = "NumberSquareOneFill",
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
                        moveTo(140f, 176f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(95f)
                        lineToRelative(-11.56f, 7.71f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8.88f, -13.32f)
                        lineToRelative(24f, -16f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140f, 80f)
                        close()
                    }
                }.build()

        return _NumberSquareOneFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSquareOneFill: ImageVector? = null
