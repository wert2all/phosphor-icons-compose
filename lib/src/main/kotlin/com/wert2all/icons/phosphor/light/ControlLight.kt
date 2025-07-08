package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.ControlLight: ImageVector
    get() {
        if (_ControlLight != null) {
            return _ControlLight!!
        }
        _ControlLight =
            ImageVector
                .Builder(
                    name = "Light.ControlLight",
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
                        moveTo(56f, 120f)
                        lineToRelative(72f, -72f)
                        lineToRelative(72f, 72f)
                    }
                }.build()

        return _ControlLight!!
    }

@Suppress("ObjectPropertyName")
private var _ControlLight: ImageVector? = null
