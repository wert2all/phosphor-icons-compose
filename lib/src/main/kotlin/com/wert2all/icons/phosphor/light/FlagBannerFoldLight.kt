package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.FlagBannerFoldLight: ImageVector
    get() {
        if (_FlagBannerFoldLight != null) {
            return _FlagBannerFoldLight!!
        }
        _FlagBannerFoldLight =
            ImageVector
                .Builder(
                    name = "Light.FlagBannerFoldLight",
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
                        lineToRelative(80f, -176f)
                        lineToRelative(-80f, 0f)
                        lineToRelative(-40f, 88f)
                        lineToRelative(80f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 136f)
                        lineToRelative(-10.91f, 24f)
                        lineToRelative(-73.09f, 0f)
                        lineToRelative(40f, -44f)
                        lineToRelative(-40f, -44f)
                        lineToRelative(113.09f, 0f)
                    }
                }.build()

        return _FlagBannerFoldLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlagBannerFoldLight: ImageVector? = null
