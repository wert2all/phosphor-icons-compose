package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.SigmaFill: ImageVector
    get() {
        if (_SigmaFill != null) {
            return _SigmaFill!!
        }
        _SigmaFill =
            ImageVector
                .Builder(
                    name = "SigmaFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(200f, 24f)
                        horizontalLineTo(56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                        verticalLineTo(216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineTo(200f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        verticalLineTo(40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                        close()
                        moveTo(184f, 88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(72f)
                        horizontalLineTo(96f)
                        lineToRelative(38.4f, 51.2f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 9.6f)
                        lineTo(96f, 184f)
                        horizontalLineToRelative(72f)
                        verticalLineTo(168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        verticalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.4f, -12.8f)
                        lineTo(118f, 128f)
                        lineTo(73.6f, 68.8f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 56f)
                        horizontalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        close()
                    }
                }.build()

        return _SigmaFill!!
    }

@Suppress("ObjectPropertyName")
private var _SigmaFill: ImageVector? = null
