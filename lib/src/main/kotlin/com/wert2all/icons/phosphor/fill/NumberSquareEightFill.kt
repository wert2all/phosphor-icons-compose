package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.NumberSquareEightFill: ImageVector
    get() {
        if (_NumberSquareEightFill != null) {
            return _NumberSquareEightFill!!
        }
        _NumberSquareEightFill =
            ImageVector
                .Builder(
                    name = "NumberSquareEightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(112f, 100f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 16f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 100f)
                        close()
                        moveTo(128f, 132f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 20f)
                        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 132f)
                        close()
                        moveTo(224f, 48f)
                        lineTo(224f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        lineTo(48f, 224f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        lineTo(32f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                        lineTo(208f, 32f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                        close()
                        moveTo(164f, 152f)
                        arcToRelative(
                            35.93f,
                            35.93f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = false,
                            -14.19f,
                            -28.61f,
                        )
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -43.62f, 0f)
                        arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 164f, 152f)
                        close()
                    }
                }.build()

        return _NumberSquareEightFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSquareEightFill: ImageVector? = null
