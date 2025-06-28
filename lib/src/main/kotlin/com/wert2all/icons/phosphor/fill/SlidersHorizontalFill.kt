package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.SlidersHorizontalFill: ImageVector
    get() {
        if (_SlidersHorizontalFill != null) {
            return _SlidersHorizontalFill!!
        }
        _SlidersHorizontalFill =
            ImageVector
                .Builder(
                    name = "SlidersHorizontalFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(32f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        lineTo(77.17f, 72f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53.66f, 0f)
                        lineTo(216f, 72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        lineTo(130.83f, 88f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -53.66f, 0f)
                        lineTo(40f, 88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 80f)
                        close()
                        moveTo(216f, 168f)
                        lineTo(194.83f, 168f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -53.66f, 0f)
                        lineTo(40f, 168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        lineTo(141.17f, 184f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 53.66f, 0f)
                        lineTo(216f, 184f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                        close()
                    }
                }.build()

        return _SlidersHorizontalFill!!
    }

@Suppress("ObjectPropertyName")
private var _SlidersHorizontalFill: ImageVector? = null
