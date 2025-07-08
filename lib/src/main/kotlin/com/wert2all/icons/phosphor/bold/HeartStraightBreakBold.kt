package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.HeartStraightBreakBold: ImageVector
    get() {
        if (_HeartStraightBreakBold != null) {
            return _HeartStraightBreakBold!!
        }
        _HeartStraightBreakBold =
            ImageVector
                .Builder(
                    name = "Bold.HeartStraightBreakBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
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

        return _HeartStraightBreakBold!!
    }

@Suppress("ObjectPropertyName")
private var _HeartStraightBreakBold: ImageVector? = null
