package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CoinVerticalDuotone: ImageVector
    get() {
        if (_CoinVerticalDuotone != null) {
            return _CoinVerticalDuotone!!
        }
        _CoinVerticalDuotone =
            ImageVector
                .Builder(
                    name = "CoinVerticalDuotone",
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
                        moveTo(48f, 128f)
                        arcToRelative(56f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 112f, 0f)
                        arcToRelative(56f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -112f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 128f)
                        arcToRelative(56f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 112f, 0f)
                        arcToRelative(56f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -112f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 32f)
                        horizontalLineToRelative(48f)
                        curveToRelative(30.93f, 0f, 56f, 43f, 56f, 96f)
                        reflectiveCurveToRelative(-25.07f, 96f, -56f, 96f)
                        horizontalLineTo(104f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(145.74f, 64f)
                        lineTo(193.74f, 64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 128f)
                        lineTo(208f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(145.74f, 192f)
                        lineTo(193.74f, 192f)
                    }
                }.build()

        return _CoinVerticalDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CoinVerticalDuotone: ImageVector? = null
