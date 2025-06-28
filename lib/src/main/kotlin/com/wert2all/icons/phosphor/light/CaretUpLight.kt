package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.CaretUpLight: ImageVector
    get() {
        if (_CaretUpLight != null) {
            return _CaretUpLight!!
        }
        _CaretUpLight =
            ImageVector
                .Builder(
                    name = "CaretUpLight",
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
                        moveTo(48f, 160f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                    }
                }.build()

        return _CaretUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUpLight: ImageVector? = null
