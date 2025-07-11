package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.CheckLight: ImageVector
    get() {
        if (_CheckLight != null) {
            return _CheckLight!!
        }
        _CheckLight =
            ImageVector
                .Builder(
                    name = "Light.CheckLight",
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
                        moveTo(40f, 144f)
                        lineToRelative(56f, 56f)
                        lineToRelative(128f, -128f)
                    }
                }.build()

        return _CheckLight!!
    }

@Suppress("ObjectPropertyName")
private var _CheckLight: ImageVector? = null
