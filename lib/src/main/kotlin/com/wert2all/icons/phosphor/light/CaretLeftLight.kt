package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.CaretLeftLight: ImageVector
    get() {
        if (_CaretLeftLight != null) {
            return _CaretLeftLight!!
        }
        _CaretLeftLight =
            ImageVector
                .Builder(
                    name = "CaretLeftLight",
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
                        moveTo(160f, 208f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(80f, -80f)
                    }
                }.build()

        return _CaretLeftLight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLeftLight: ImageVector? = null
