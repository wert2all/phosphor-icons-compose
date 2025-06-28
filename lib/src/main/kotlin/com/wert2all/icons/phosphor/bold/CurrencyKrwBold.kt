package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.CurrencyKrwBold: ImageVector
    get() {
        if (_CurrencyKrwBold != null) {
            return _CurrencyKrwBold!!
        }
        _CurrencyKrwBold =
            ImageVector
                .Builder(
                    name = "CurrencyKrwBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 136f)
                        lineTo(240f, 136f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 72f)
                        lineToRelative(52f, 128f)
                        lineToRelative(52f, -128f)
                        lineToRelative(52f, 128f)
                        lineToRelative(52f, -128f)
                    }
                }.build()

        return _CurrencyKrwBold!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyKrwBold: ImageVector? = null
