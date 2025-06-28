package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.FlagBannerThin: ImageVector
    get() {
        if (_FlagBannerThin != null) {
            return _FlagBannerThin!!
        }
        _FlagBannerThin =
            ImageVector
                .Builder(
                    name = "FlagBannerThin",
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
                        moveTo(152f, 224f)
                        lineToRelative(80f, -168f)
                        lineToRelative(-192f, 0f)
                        lineToRelative(48f, 48f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(146.29f, 0f)
                    }
                }.build()

        return _FlagBannerThin!!
    }

@Suppress("ObjectPropertyName")
private var _FlagBannerThin: ImageVector? = null
