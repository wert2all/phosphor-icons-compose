package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.CurrencyNgnBold: ImageVector
    get() {
        if (_CurrencyNgnBold != null) {
            return _CurrencyNgnBold!!
        }
        _CurrencyNgnBold =
            ImageVector
                .Builder(
                    name = "CurrencyNgnBold",
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
                        moveTo(40f, 128f)
                        lineTo(216f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 210f)
                        lineToRelative(0f, -164f)
                        lineToRelative(128f, 164f)
                        lineToRelative(0f, -164f)
                    }
                }.build()

        return _CurrencyNgnBold!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyNgnBold: ImageVector? = null
