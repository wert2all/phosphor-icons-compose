package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.HeartBreakThin: ImageVector
    get() {
        if (_HeartBreakThin != null) {
            return _HeartBreakThin!!
        }
        _HeartBreakThin =
            ImageVector
                .Builder(
                    name = "HeartBreakThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 75.63f)
                        lineTo(116.18f, 63.82f)
                        arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 102f)
                        curveToRelative(0f, 66f, 104f, 122f, 104f, 122f)
                        reflectiveCurveToRelative(104f, -56f, 104f, -122f)
                        arcToRelative(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -92.18f, -38.18f)
                        lineTo(112f, 91.63f)
                        lineToRelative(30.18f, 30.19f)
                        lineTo(120f, 144f)
                    }
                }.build()

        return _HeartBreakThin!!
    }

@Suppress("ObjectPropertyName")
private var _HeartBreakThin: ImageVector? = null
