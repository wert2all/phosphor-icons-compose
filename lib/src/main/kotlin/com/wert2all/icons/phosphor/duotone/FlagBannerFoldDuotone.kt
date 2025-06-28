package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.FlagBannerFoldDuotone: ImageVector
    get() {
        if (_FlagBannerFoldDuotone != null) {
            return _FlagBannerFoldDuotone!!
        }
        _FlagBannerFoldDuotone =
            ImageVector
                .Builder(
                    name = "FlagBannerFoldDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(101.09f, 160f)
                        lineToRelative(-73.09f, 0f)
                        lineToRelative(40f, -44f)
                        lineToRelative(-40f, -44f)
                        lineToRelative(113.09f, 0f)
                        lineToRelative(-40f, 88f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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
                        strokeLineWidth = 16f,
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

        return _FlagBannerFoldDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FlagBannerFoldDuotone: ImageVector? = null
