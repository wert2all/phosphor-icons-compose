package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.WaveSquare: ImageVector
    get() {
        if (_WaveSquare != null) {
            return _WaveSquare!!
        }
        _WaveSquare =
            ImageVector
                .Builder(
                    name = "Regular.WaveSquare",
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
                        moveTo(232f, 128f)
                        lineToRelative(0f, 56f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, -112f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, 56f)
                    }
                }.build()

        return _WaveSquare!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSquare: ImageVector? = null
