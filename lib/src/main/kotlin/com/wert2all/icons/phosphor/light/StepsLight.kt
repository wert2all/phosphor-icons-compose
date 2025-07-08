package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.StepsLight: ImageVector
    get() {
        if (_StepsLight != null) {
            return _StepsLight!!
        }
        _StepsLight =
            ImageVector
                .Builder(
                    name = "Light.StepsLight",
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
                        moveTo(16f, 200f)
                        lineToRelative(56f, 0f)
                        lineToRelative(0f, -48f)
                        lineToRelative(56f, 0f)
                        lineToRelative(0f, -48f)
                        lineToRelative(56f, 0f)
                        lineToRelative(0f, -48f)
                        lineToRelative(56f, 0f)
                    }
                }.build()

        return _StepsLight!!
    }

@Suppress("ObjectPropertyName")
private var _StepsLight: ImageVector? = null
