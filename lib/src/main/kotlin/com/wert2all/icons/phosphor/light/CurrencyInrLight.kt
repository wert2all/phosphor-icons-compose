package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.CurrencyInrLight: ImageVector
    get() {
        if (_CurrencyInrLight != null) {
            return _CurrencyInrLight!!
        }
        _CurrencyInrLight =
            ImageVector
                .Builder(
                    name = "Light.CurrencyInrLight",
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
                        moveTo(72f, 80f)
                        lineTo(200f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 40f)
                        lineTo(200f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(108f, 40f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 104f)
                        horizontalLineTo(72f)
                        lineToRelative(88f, 80f)
                    }
                }.build()

        return _CurrencyInrLight!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyInrLight: ImageVector? = null
