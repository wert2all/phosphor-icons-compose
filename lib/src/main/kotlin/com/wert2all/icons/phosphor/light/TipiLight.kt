package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.TipiLight: ImageVector
    get() {
        if (_TipiLight != null) {
            return _TipiLight!!
        }
        _TipiLight =
            ImageVector
                .Builder(
                    name = "Light.TipiLight",
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
                        moveTo(104f, 16f)
                        lineToRelative(128f, 200f)
                        lineToRelative(-208f, 0f)
                        lineToRelative(128f, -200f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(71.68f, 216f)
                        lineToRelative(56.32f, -88f)
                        lineToRelative(56.32f, 88f)
                    }
                }.build()

        return _TipiLight!!
    }

@Suppress("ObjectPropertyName")
private var _TipiLight: ImageVector? = null
