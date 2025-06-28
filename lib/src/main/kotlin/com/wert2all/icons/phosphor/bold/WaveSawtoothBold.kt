package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.WaveSawtoothBold: ImageVector
    get() {
        if (_WaveSawtoothBold != null) {
            return _WaveSawtoothBold!!
        }
        _WaveSawtoothBold =
            ImageVector
                .Builder(
                    name = "WaveSawtoothBold",
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
                        moveTo(24f, 128f)
                        lineToRelative(104f, -64f)
                        lineToRelative(0f, 128f)
                        lineToRelative(104f, -64f)
                    }
                }.build()

        return _WaveSawtoothBold!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSawtoothBold: ImageVector? = null
