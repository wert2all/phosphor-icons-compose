package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.HeartStraightBreakLight: ImageVector
    get() {
        if (_HeartStraightBreakLight != null) {
            return _HeartStraightBreakLight!!
        }
        _HeartStraightBreakLight =
            ImageVector
                .Builder(
                    name = "HeartStraightBreakLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 80.6f)
                        lineToRelative(-18.64f, -18f)
                        arcToRelative(50f, 50f, 0f, isMoreThanHalf = false, isPositiveArc = false, -70.72f, 70.72f)
                        lineTo(128f, 224f)
                        lineToRelative(89.36f, -90.64f)
                        arcToRelative(50f, 50f, 0f, isMoreThanHalf = true, isPositiveArc = false, -70.72f, -70.72f)
                        lineTo(112f, 96f)
                        lineToRelative(32f, 32f)
                        lineToRelative(-16f, 16f)
                    }
                }.build()

        return _HeartStraightBreakLight!!
    }

@Suppress("ObjectPropertyName")
private var _HeartStraightBreakLight: ImageVector? = null
