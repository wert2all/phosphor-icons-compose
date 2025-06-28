package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.LeafBold: ImageVector
    get() {
        if (_LeafBold != null) {
            return _LeafBold!!
        }
        _LeafBold =
            ImageVector
                .Builder(
                    name = "LeafBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(63.81f, 192.19f)
                        curveToRelative(-47.89f, -79.81f, 16f, -159.62f, 151.64f, -151.64f)
                        curveTo(223.43f, 176.23f, 143.62f, 240.08f, 63.81f, 192.19f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 96f)
                        lineTo(40f, 216f)
                    }
                }.build()

        return _LeafBold!!
    }

@Suppress("ObjectPropertyName")
private var _LeafBold: ImageVector? = null
