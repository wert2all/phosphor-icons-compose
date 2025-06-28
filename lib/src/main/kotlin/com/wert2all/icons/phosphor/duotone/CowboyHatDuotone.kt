package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CowboyHatDuotone: ImageVector
    get() {
        if (_CowboyHatDuotone != null) {
            return _CowboyHatDuotone!!
        }
        _CowboyHatDuotone =
            ImageVector
                .Builder(
                    name = "CowboyHatDuotone",
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
                        moveTo(65.47f, 160.18f)
                        curveTo(97.87f, 192f, 128f, 192f, 128f, 192f)
                        reflectiveCurveToRelative(30.13f, 0f, 62.53f, -31.82f)
                        lineTo(185.94f, 136f)
                        horizontalLineTo(70.06f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 128f)
                        curveToRelative(40f, 64f, 88f, 64f, 88f, 64f)
                        reflectiveCurveToRelative(48f, 0f, 88f, -64f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 64f)
                        horizontalLineTo(40f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(65.47f, 160.18f)
                        lineTo(85.54f, 54.53f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 98.4f, 49.76f)
                        lineTo(123f, 70.25f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                        lineToRelative(24.6f, -20.49f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.86f, 4.77f)
                        lineToRelative(20.07f, 105.65f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(70.06f, 136f)
                        lineTo(185.94f, 136f)
                    }
                }.build()

        return _CowboyHatDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CowboyHatDuotone: ImageVector? = null
