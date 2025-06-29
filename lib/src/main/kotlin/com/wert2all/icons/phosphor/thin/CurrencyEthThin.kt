package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.CurrencyEthThin: ImageVector
    get() {
        if (_CurrencyEthThin != null) {
            return _CurrencyEthThin!!
        }
        _CurrencyEthThin =
            ImageVector
                .Builder(
                    name = "CurrencyEthThin",
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
                        moveTo(128f, 16f)
                        lineTo(128f, 240f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 128f)
                        lineToRelative(-88f, 40f)
                        lineToRelative(-88f, -40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 16f)
                        lineToRelative(88f, 112f)
                        lineToRelative(-88f, 112f)
                        lineToRelative(-88f, -112f)
                        lineToRelative(88f, -112f)
                        close()
                    }
                }.build()

        return _CurrencyEthThin!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEthThin: ImageVector? = null
