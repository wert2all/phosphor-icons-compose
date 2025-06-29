package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.CurrencyKrw: ImageVector
    get() {
        if (_CurrencyKrw != null) {
            return _CurrencyKrw!!
        }
        _CurrencyKrw =
            ImageVector
                .Builder(
                    name = "CurrencyKrw",
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
                        moveTo(24f, 72f)
                        lineToRelative(52f, 128f)
                        lineToRelative(52f, -128f)
                        lineToRelative(52f, 128f)
                        lineToRelative(52f, -128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 136f)
                        lineTo(240f, 136f)
                    }
                }.build()

        return _CurrencyKrw!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyKrw: ImageVector? = null
