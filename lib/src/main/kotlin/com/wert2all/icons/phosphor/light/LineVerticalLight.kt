package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.LineVerticalLight: ImageVector
    get() {
        if (_LineVerticalLight != null) {
            return _LineVerticalLight!!
        }
        _LineVerticalLight =
            ImageVector
                .Builder(
                    name = "Light.LineVerticalLight",
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
                        moveTo(128f, 24f)
                        lineTo(128f, 232f)
                    }
                }.build()

        return _LineVerticalLight!!
    }

@Suppress("ObjectPropertyName")
private var _LineVerticalLight: ImageVector? = null
