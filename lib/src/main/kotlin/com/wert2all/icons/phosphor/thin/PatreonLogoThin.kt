package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.PatreonLogoThin: ImageVector
    get() {
        if (_PatreonLogoThin != null) {
            return _PatreonLogoThin!!
        }
        _PatreonLogoThin =
            ImageVector
                .Builder(
                    name = "PatreonLogoThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(151.75f, 158.5f)
                        curveTo(175.83f, 142.16f, 224f, 142.16f, 224f, 93.16f)
                        curveToRelative(0f, -65.34f, -104.36f, -81.67f, -152.53f, -32.67f)
                        curveTo(25.78f, 107f, 55.41f, 232f, 87.52f, 232f)
                        reflectiveCurveTo(121.88f, 178.76f, 151.75f, 158.5f)
                        close()
                    }
                }.build()

        return _PatreonLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _PatreonLogoThin: ImageVector? = null
