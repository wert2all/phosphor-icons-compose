package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.WaveSineThin: ImageVector
    get() {
        if (_WaveSineThin != null) {
            return _WaveSineThin!!
        }
        _WaveSineThin =
            ImageVector
                .Builder(
                    name = "Thin.WaveSineThin",
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
                        curveToRelative(104f, -221.7f, 104f, 221.7f, 208f, 0f)
                    }
                }.build()

        return _WaveSineThin!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSineThin: ImageVector? = null
