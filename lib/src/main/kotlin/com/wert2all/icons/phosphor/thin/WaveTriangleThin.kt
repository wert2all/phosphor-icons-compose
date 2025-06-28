package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.WaveTriangleThin: ImageVector
    get() {
        if (_WaveTriangleThin != null) {
            return _WaveTriangleThin!!
        }
        _WaveTriangleThin =
            ImageVector
                .Builder(
                    name = "WaveTriangleThin",
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
                        moveTo(24f, 128f)
                        lineToRelative(52f, -72f)
                        lineToRelative(104f, 144f)
                        lineToRelative(52f, -72f)
                    }
                }.build()

        return _WaveTriangleThin!!
    }

@Suppress("ObjectPropertyName")
private var _WaveTriangleThin: ImageVector? = null
