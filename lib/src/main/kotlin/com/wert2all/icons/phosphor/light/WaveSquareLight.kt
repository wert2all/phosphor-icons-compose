package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.WaveSquareLight: ImageVector
    get() {
        if (_WaveSquareLight != null) {
            return _WaveSquareLight!!
        }
        _WaveSquareLight =
            ImageVector
                .Builder(
                    name = "WaveSquareLight",
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
                        moveTo(232f, 128f)
                        lineToRelative(0f, 56f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, -112f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, 56f)
                    }
                }.build()

        return _WaveSquareLight!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSquareLight: ImageVector? = null
