package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.WaveSawtoothThin: ImageVector
    get() {
        if (_WaveSawtoothThin != null) {
            return _WaveSawtoothThin!!
        }
        _WaveSawtoothThin =
            ImageVector
                .Builder(
                    name = "WaveSawtoothThin",
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
                        lineToRelative(104f, -64f)
                        lineToRelative(0f, 128f)
                        lineToRelative(104f, -64f)
                    }
                }.build()

        return _WaveSawtoothThin!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSawtoothThin: ImageVector? = null
