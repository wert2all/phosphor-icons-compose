package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.WaveSquareThin: ImageVector
    get() {
        if (_WaveSquareThin != null) {
            return _WaveSquareThin!!
        }
        _WaveSquareThin =
            ImageVector
                .Builder(
                    name = "WaveSquareThin",
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
                        moveTo(232f, 128f)
                        lineToRelative(0f, 56f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, -112f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, 56f)
                    }
                }.build()

        return _WaveSquareThin!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSquareThin: ImageVector? = null
