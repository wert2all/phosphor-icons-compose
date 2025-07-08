package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.WaveSquareDuotone: ImageVector
    get() {
        if (_WaveSquareDuotone != null) {
            return _WaveSquareDuotone!!
        }
        _WaveSquareDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.WaveSquareDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(232f, 128f)
                        lineToRelative(0f, 56f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, -112f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, 56f)
                        lineToRelative(208f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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

        return _WaveSquareDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSquareDuotone: ImageVector? = null
