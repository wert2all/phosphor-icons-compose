package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.HeartStraightFill: ImageVector
    get() {
        if (_HeartStraightFill != null) {
            return _HeartStraightFill!!
        }
        _HeartStraightFill =
            ImageVector
                .Builder(
                    name = "HeartStraightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(240f, 98f)
                        arcToRelative(57.63f, 57.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17f, 41f)
                        lineTo(133.7f, 229.62f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.4f, 0f)
                        lineTo(33f, 139f)
                        arcToRelative(58f, 58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 82f, -82.1f)
                        lineTo(128f, 69.05f)
                        lineToRelative(13.09f, -12.19f)
                        arcTo(58f, 58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 98f)
                        close()
                    }
                }.build()

        return _HeartStraightFill!!
    }

@Suppress("ObjectPropertyName")
private var _HeartStraightFill: ImageVector? = null
