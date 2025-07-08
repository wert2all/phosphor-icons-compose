package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.CurrencyEthBold: ImageVector
    get() {
        if (_CurrencyEthBold != null) {
            return _CurrencyEthBold!!
        }
        _CurrencyEthBold =
            ImageVector
                .Builder(
                    name = "Bold.CurrencyEthBold",
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
                        moveTo(128f, 16f)
                        lineTo(128f, 240f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 128f)
                        lineToRelative(-88f, 40f)
                        lineToRelative(-88f, -40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
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

        return _CurrencyEthBold!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEthBold: ImageVector? = null
