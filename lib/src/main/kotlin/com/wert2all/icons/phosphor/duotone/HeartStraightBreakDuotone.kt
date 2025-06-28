package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.HeartStraightBreakDuotone: ImageVector
    get() {
        if (_HeartStraightBreakDuotone != null) {
            return _HeartStraightBreakDuotone!!
        }
        _HeartStraightBreakDuotone =
            ImageVector
                .Builder(
                    name = "HeartStraightBreakDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(128f, 224f)
                        lineToRelative(89.36f, -90.64f)
                        arcToRelative(50f, 50f, 0f, isMoreThanHalf = true, isPositiveArc = false, -70.72f, -70.72f)
                        lineTo(128f, 80f)
                        lineTo(109.36f, 62.64f)
                        arcToRelative(50f, 50f, 0f, isMoreThanHalf = false, isPositiveArc = false, -70.72f, 70.72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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

        return _HeartStraightBreakDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HeartStraightBreakDuotone: ImageVector? = null
