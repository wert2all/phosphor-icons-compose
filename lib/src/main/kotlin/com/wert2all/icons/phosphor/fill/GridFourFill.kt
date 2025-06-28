package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.GridFourFill: ImageVector
    get() {
        if (_GridFourFill != null) {
            return _GridFourFill!!
        }
        _GridFourFill =
            ImageVector
                .Builder(
                    name = "GridFourFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(216f, 56f)
                        verticalLineToRelative(60f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                        lineTo(136f, 120f)
                        lineTo(136f, 44f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                        horizontalLineToRelative(60f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 56f)
                        close()
                        moveTo(116f, 40f)
                        lineTo(56f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 56f)
                        verticalLineToRelative(60f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                        horizontalLineToRelative(76f)
                        lineTo(120f, 44f)
                        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 116f, 40f)
                        close()
                        moveTo(212f, 136f)
                        lineTo(136f, 136f)
                        verticalLineToRelative(76f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                        horizontalLineToRelative(60f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(216f, 140f)
                        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212f, 136f)
                        close()
                        moveTo(40f, 140f)
                        verticalLineToRelative(60f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineToRelative(60f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                        lineTo(120f, 136f)
                        lineTo(44f, 136f)
                        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 140f)
                        close()
                    }
                }.build()

        return _GridFourFill!!
    }

@Suppress("ObjectPropertyName")
private var _GridFourFill: ImageVector? = null
