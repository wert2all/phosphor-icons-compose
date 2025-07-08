package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.CaretDoubleUpLight: ImageVector
    get() {
        if (_CaretDoubleUpLight != null) {
            return _CaretDoubleUpLight!!
        }
        _CaretDoubleUpLight =
            ImageVector
                .Builder(
                    name = "Light.CaretDoubleUpLight",
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
                        moveTo(48f, 200f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 120f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                    }
                }.build()

        return _CaretDoubleUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleUpLight: ImageVector? = null
