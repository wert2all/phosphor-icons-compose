package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CurrencyEthDuotone: ImageVector
    get() {
        if (_CurrencyEthDuotone != null) {
            return _CurrencyEthDuotone!!
        }
        _CurrencyEthDuotone =
            ImageVector
                .Builder(
                    name = "CurrencyEthDuotone",
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
                        moveTo(40f, 128f)
                        lineToRelative(88f, 112f)
                        lineToRelative(88f, -112f)
                        lineToRelative(-88f, 40f)
                        lineToRelative(-88f, -40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 16f)
                        lineTo(128f, 240f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 128f)
                        lineToRelative(-88f, 40f)
                        lineToRelative(-88f, -40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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

        return _CurrencyEthDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEthDuotone: ImageVector? = null
