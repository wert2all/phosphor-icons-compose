package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.WaveSine: ImageVector
    get() {
        if (_WaveSine != null) {
            return _WaveSine!!
        }
        _WaveSine =
            ImageVector
                .Builder(
                    name = "WaveSine",
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
                        curveToRelative(104f, -221.7f, 104f, 221.7f, 208f, 0f)
                    }
                }.build()

        return _WaveSine!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSine: ImageVector? = null
