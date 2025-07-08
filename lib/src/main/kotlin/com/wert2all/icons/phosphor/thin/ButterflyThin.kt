package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ButterflyThin: ImageVector
    get() {
        if (_ButterflyThin != null) {
            return _ButterflyThin!!
        }
        _ButterflyThin =
            ImageVector
                .Builder(
                    name = "Thin.ButterflyThin",
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
                        moveTo(128f, 56f)
                        lineTo(128f, 180f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(187.76f, 151.94f)
                        curveToRelative(8.05f, 0.48f, 29.5f, -1.29f, 37.36f, -32.23f)
                        curveTo(233.21f, 87.84f, 240.22f, 48f, 208.93f, 48f)
                        reflectiveCurveTo(128f, 95.8f, 128f, 127.67f)
                        curveTo(128f, 95.8f, 78.36f, 48f, 47.07f, 48f)
                        reflectiveCurveTo(22.79f, 87.84f, 30.88f, 119.71f)
                        curveToRelative(7.86f, 30.94f, 29.31f, 32.71f, 37.36f, 32.23f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 144f)
                        arcToRelative(36.11f, 36.11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 40f, 36f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 40f, -36f)
                    }
                }.build()

        return _ButterflyThin!!
    }

@Suppress("ObjectPropertyName")
private var _ButterflyThin: ImageVector? = null
