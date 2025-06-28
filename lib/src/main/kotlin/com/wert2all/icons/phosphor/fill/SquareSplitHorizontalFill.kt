package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.SquareSplitHorizontalFill: ImageVector
    get() {
        if (_SquareSplitHorizontalFill != null) {
            return _SquareSplitHorizontalFill!!
        }
        _SquareSplitHorizontalFill =
            ImageVector
                .Builder(
                    name = "SquareSplitHorizontalFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(120f, 44f)
                        lineTo(120f, 212f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                        lineTo(56f, 216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        lineTo(40f, 56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 40f)
                        horizontalLineToRelative(60f)
                        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 44f)
                        close()
                        moveTo(200f, 40f)
                        lineTo(140f, 40f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                        lineTo(136f, 212f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                        horizontalLineToRelative(60f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(216f, 56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 40f)
                        close()
                    }
                }.build()

        return _SquareSplitHorizontalFill!!
    }

@Suppress("ObjectPropertyName")
private var _SquareSplitHorizontalFill: ImageVector? = null
