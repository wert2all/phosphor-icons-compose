package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.CurrencyEur: ImageVector
    get() {
        if (_CurrencyEur != null) {
            return _CurrencyEur!!
        }
        _CurrencyEur =
            ImageVector
                .Builder(
                    name = "Regular.CurrencyEur",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 112f)
                        lineTo(136f, 112f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 144f)
                        lineTo(120f, 144f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 197.67f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 144f)
                        verticalLineTo(112f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 58.33f)
                    }
                }.build()

        return _CurrencyEur!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEur: ImageVector? = null
