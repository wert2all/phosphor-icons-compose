package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.CaretLineUpLight: ImageVector
    get() {
        if (_CaretLineUpLight != null) {
            return _CaretLineUpLight!!
        }
        _CaretLineUpLight =
            ImageVector
                .Builder(
                    name = "CaretLineUpLight",
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
                        moveTo(48f, 192f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 72f)
                        lineTo(208f, 72f)
                    }
                }.build()

        return _CaretLineUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineUpLight: ImageVector? = null
