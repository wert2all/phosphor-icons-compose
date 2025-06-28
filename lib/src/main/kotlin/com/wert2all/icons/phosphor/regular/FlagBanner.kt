package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.FlagBanner: ImageVector
    get() {
        if (_FlagBanner != null) {
            return _FlagBanner!!
        }
        _FlagBanner =
            ImageVector
                .Builder(
                    name = "FlagBanner",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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

        return _FlagBanner!!
    }

@Suppress("ObjectPropertyName")
private var _FlagBanner: ImageVector? = null
