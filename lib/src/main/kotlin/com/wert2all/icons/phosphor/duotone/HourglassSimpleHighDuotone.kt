package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.HourglassSimpleHighDuotone: ImageVector
    get() {
        if (_HourglassSimpleHighDuotone != null) {
            return _HourglassSimpleHighDuotone!!
        }
        _HourglassSimpleHighDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.HourglassSimpleHighDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(69.52f, 72f)
                        lineToRelative(116.96f, 0f)
                        lineToRelative(-58.48f, 56f)
                        lineToRelative(-58.48f, -56f)
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
                        moveTo(69.52f, 72f)
                        lineTo(186.48f, 72f)
                    }
                }.build()

        return _HourglassSimpleHighDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassSimpleHighDuotone: ImageVector? = null
