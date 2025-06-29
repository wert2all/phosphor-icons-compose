package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ThreadsLogoLight: ImageVector
    get() {
        if (_ThreadsLogoLight != null) {
            return _ThreadsLogoLight!!
        }
        _ThreadsLogoLight =
            ImageVector
                .Builder(
                    name = "ThreadsLogoLight",
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
                        moveTo(200f, 77.65f)
                        curveTo(189.86f, 51.29f, 168.57f, 32f, 128f, 32f)
                        curveToRelative(-64f, 0f, -80f, 48f, -80f, 96f)
                        reflectiveCurveToRelative(16f, 96f, 80f, 96f)
                        curveToRelative(48f, 0f, 72f, -32f, 72f, -56f)
                        curveToRelative(0f, -64f, -104f, -64f, -104f, -16f)
                        curveToRelative(0f, 40f, 72f, 40f, 72f, -24f)
                        curveToRelative(0f, -56f, -56f, -56f, -72f, -32f)
                    }
                }.build()

        return _ThreadsLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _ThreadsLogoLight: ImageVector? = null
