package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.HeartStraightBreakFill: ImageVector
    get() {
        if (_HeartStraightBreakFill != null) {
            return _HeartStraightBreakFill!!
        }
        _HeartStraightBreakFill =
            ImageVector
                .Builder(
                    name = "HeartStraightBreakFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(113.29f, 55.31f)
                        arcTo(58f, 58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.93f, 139f)
                        lineToRelative(89.37f, 90.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.4f, 0f)
                        lineTo(223f, 139f)
                        arcToRelative(58f, 58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -82f, -82.1f)
                        horizontalLineToRelative(0f)
                        lineToRelative(-24.4f, 23f)
                        lineTo(143f, 106.32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                        lineToRelative(-20.69f, 20.69f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 111f, 127f)
                        lineToRelative(15f, -15f)
                        lineTo(99.5f, 85.42f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.22f, -11.53f)
                        lineToRelative(13.55f, -12.78f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.8f)
                        close()
                    }
                }.build()

        return _HeartStraightBreakFill!!
    }

@Suppress("ObjectPropertyName")
private var _HeartStraightBreakFill: ImageVector? = null
