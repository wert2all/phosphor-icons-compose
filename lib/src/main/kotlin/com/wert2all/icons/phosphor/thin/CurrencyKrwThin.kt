package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.CurrencyKrwThin: ImageVector
    get() {
        if (_CurrencyKrwThin != null) {
            return _CurrencyKrwThin!!
        }
        _CurrencyKrwThin =
            ImageVector
                .Builder(
                    name = "Thin.CurrencyKrwThin",
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
                        moveTo(16f, 136f)
                        lineTo(240f, 136f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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

        return _CurrencyKrwThin!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyKrwThin: ImageVector? = null
