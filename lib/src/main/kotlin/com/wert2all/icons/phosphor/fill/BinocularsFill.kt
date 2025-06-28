package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.BinocularsFill: ImageVector
    get() {
        if (_BinocularsFill != null) {
            return _BinocularsFill!!
        }
        _BinocularsFill =
            ImageVector
                .Builder(
                    name = "BinocularsFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(237.22f, 151.9f)
                        lineToRelative(0f, -0.1f)
                        arcToRelative(1.42f, 1.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.07f, -0.22f)
                        arcToRelative(48.46f, 48.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, -5.3f)
                        lineTo(193.27f, 51.8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.67f, -2.44f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, 0f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 55f)
                        lineTo(144f, 80f)
                        lineTo(112f, 80f)
                        lineTo(112f, 55f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.67f, 2.44f)
                        lineTo(21.2f, 146.28f)
                        arcToRelative(48.46f, 48.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, 5.3f)
                        arcToRelative(1.72f, 1.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.07f, 0.21f)
                        reflectiveCurveToRelative(0f, 0.08f, 0f, 0.11f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.32f, 32.51f)
                        arcToRelative(47.49f, 47.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.9f, -16.59f)
                        lineTo(112.04f, 96f)
                        horizontalLineToRelative(32f)
                        verticalLineToRelative(71.83f)
                        arcToRelative(47.49f, 47.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.9f, 16.59f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.32f, -32.51f)
                        close()
                        moveTo(94.07f, 178.9f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -60.2f, -21.71f)
                        lineToRelative(1.81f, -4.13f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 167.88f)
                        lineTo(96f, 168f)
                        horizontalLineToRelative(0f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94.07f, 178.94f)
                        close()
                        moveTo(203f, 198.07f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 168f)
                        horizontalLineToRelative(0f)
                        verticalLineToRelative(-0.11f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60.32f, -14.78f)
                        lineToRelative(1.81f, 4.13f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 203f, 198.07f)
                        close()
                    }
                }.build()

        return _BinocularsFill!!
    }

@Suppress("ObjectPropertyName")
private var _BinocularsFill: ImageVector? = null
