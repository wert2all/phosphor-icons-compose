package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.WaveSineLight: ImageVector
    get() {
        if (_WaveSineLight != null) {
            return _WaveSineLight!!
        }
        _WaveSineLight =
            ImageVector
                .Builder(
                    name = "WaveSineLight",
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
                        moveTo(24f, 128f)
                        curveToRelative(104f, -221.7f, 104f, 221.7f, 208f, 0f)
                    }
                }.build()

        return _WaveSineLight!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSineLight: ImageVector? = null
