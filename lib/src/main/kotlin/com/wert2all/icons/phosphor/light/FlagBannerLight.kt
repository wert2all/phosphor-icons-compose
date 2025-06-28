package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.FlagBannerLight: ImageVector
    get() {
        if (_FlagBannerLight != null) {
            return _FlagBannerLight!!
        }
        _FlagBannerLight =
            ImageVector
                .Builder(
                    name = "FlagBannerLight",
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
                        moveTo(152f, 224f)
                        lineToRelative(80f, -168f)
                        lineToRelative(-192f, 0f)
                        lineToRelative(48f, 48f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(146.29f, 0f)
                    }
                }.build()

        return _FlagBannerLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlagBannerLight: ImageVector? = null
