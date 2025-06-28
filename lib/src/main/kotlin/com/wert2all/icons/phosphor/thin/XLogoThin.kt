package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.XLogoThin: ImageVector
    get() {
        if (_XLogoThin != null) {
            return _XLogoThin!!
        }
        _XLogoThin =
            ImageVector
                .Builder(
                    name = "XLogoThin",
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
                        moveTo(48f, 40f)
                        lineToRelative(48f, 0f)
                        lineToRelative(112f, 176f)
                        lineToRelative(-48f, 0f)
                        lineToRelative(-112f, -176f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(113.88f, 143.53f)
                        lineTo(48f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 40f)
                        lineTo(142.12f, 112.47f)
                    }
                }.build()

        return _XLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _XLogoThin: ImageVector? = null
