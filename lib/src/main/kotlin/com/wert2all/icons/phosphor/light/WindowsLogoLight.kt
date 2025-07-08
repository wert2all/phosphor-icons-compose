package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.WindowsLogoLight: ImageVector
    get() {
        if (_WindowsLogoLight != null) {
            return _WindowsLogoLight!!
        }
        _WindowsLogoLight =
            ImageVector
                .Builder(
                    name = "Light.WindowsLogoLight",
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
                        moveTo(208f, 216f)
                        lineToRelative(-80f, -14.54f)
                        lineToRelative(0f, 0f)
                        lineToRelative(0f, -57.46f)
                        lineToRelative(80f, 0f)
                        lineToRelative(0f, 72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 195.64f)
                        lineToRelative(-64f, -11.64f)
                        lineToRelative(0f, -40f)
                        lineToRelative(64f, 0f)
                        lineToRelative(0f, 51.64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 40f)
                        lineToRelative(-80f, 14.55f)
                        lineToRelative(0f, 0f)
                        lineToRelative(0f, 57.45f)
                        lineToRelative(80f, 0f)
                        lineToRelative(0f, -72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 60.36f)
                        lineToRelative(-64f, 11.64f)
                        lineToRelative(0f, 40f)
                        lineToRelative(64f, 0f)
                        lineToRelative(0f, -51.64f)
                        close()
                    }
                }.build()

        return _WindowsLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _WindowsLogoLight: ImageVector? = null
