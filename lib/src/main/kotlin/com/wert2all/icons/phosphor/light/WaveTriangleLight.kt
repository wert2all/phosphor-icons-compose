package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.WaveTriangleLight: ImageVector
    get() {
        if (_WaveTriangleLight != null) {
            return _WaveTriangleLight!!
        }
        _WaveTriangleLight =
            ImageVector
                .Builder(
                    name = "Light.WaveTriangleLight",
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
                        lineToRelative(52f, -72f)
                        lineToRelative(104f, 144f)
                        lineToRelative(52f, -72f)
                    }
                }.build()

        return _WaveTriangleLight!!
    }

@Suppress("ObjectPropertyName")
private var _WaveTriangleLight: ImageVector? = null
