package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.StarHalfLight: ImageVector
    get() {
        if (_StarHalfLight != null) {
            return _StarHalfLight!!
        }
        _StarHalfLight =
            ImageVector
                .Builder(
                    name = "Light.StarHalfLight",
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
                        moveTo(224f, 113.15f)
                        lineToRelative(5.06f, -4.36f)
                        arcTo(8.46f, 8.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224.27f, 94f)
                        lineTo(216f, 93.29f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184.44f, 168f)
                        lineToRelative(-4.07f, -17.22f)
                        lineToRelative(11.63f, -10.03f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 189.09f)
                        lineTo(128f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 218.61f)
                        lineToRelative(6.72f, 4.13f)
                        arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.52f, -9.17f)
                        lineTo(193.92f, 208f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 90.07f)
                        lineTo(160.36f, 88.8f)
                        lineTo(135.74f, 29.2f)
                        arcToRelative(8.36f, 8.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.48f, 0f)
                        lineTo(95.64f, 88.8f)
                        lineTo(31.73f, 94f)
                        arcToRelative(8.46f, 8.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.79f, 14.83f)
                        lineToRelative(48.7f, 42f)
                        lineTo(60.76f, 213.57f)
                        arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.52f, 9.17f)
                        lineTo(128f, 189.09f)
                        lineTo(139.24f, 196f)
                    }
                }.build()

        return _StarHalfLight!!
    }

@Suppress("ObjectPropertyName")
private var _StarHalfLight: ImageVector? = null
