package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.HourglassSimpleMediumDuotone: ImageVector
    get() {
        if (_HourglassSimpleMediumDuotone != null) {
            return _HourglassSimpleMediumDuotone!!
        }
        _HourglassSimpleMediumDuotone =
            ImageVector
                .Builder(
                    name = "HourglassSimpleMediumDuotone",
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
                        moveTo(77.87f, 80f)
                        lineToRelative(100.26f, 0f)
                        lineToRelative(-50.13f, 48f)
                        lineToRelative(-50.13f, -48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(50.36f, 53.66f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 40f)
                        horizontalLineTo(200f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                        lineTo(128f, 128f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(50.36f, 202.34f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 216f)
                        horizontalLineTo(200f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
                        lineTo(128f, 128f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 128f)
                        lineTo(128f, 168f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(178.13f, 80f)
                        lineTo(77.87f, 80f)
                    }
                }.build()

        return _HourglassSimpleMediumDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassSimpleMediumDuotone: ImageVector? = null
