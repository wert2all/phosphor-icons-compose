package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.WaveTriangleDuotone: ImageVector
    get() {
        if (_WaveTriangleDuotone != null) {
            return _WaveTriangleDuotone!!
        }
        _WaveTriangleDuotone =
            ImageVector
                .Builder(
                    name = "WaveTriangleDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 128f)
                        lineToRelative(52f, -72f)
                        lineToRelative(104f, 144f)
                        lineToRelative(52f, -72f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(24f, 128f)
                        lineToRelative(52f, -72f)
                        lineToRelative(104f, 144f)
                        lineToRelative(52f, -72f)
                        lineToRelative(-208f, 0f)
                        close()
                    }
                }.build()

        return _WaveTriangleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WaveTriangleDuotone: ImageVector? = null
