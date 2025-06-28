package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.LeafDuotone: ImageVector
    get() {
        if (_LeafDuotone != null) {
            return _LeafDuotone!!
        }
        _LeafDuotone =
            ImageVector
                .Builder(
                    name = "LeafDuotone",
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
                        moveTo(63.81f, 192.19f)
                        curveToRelative(-47.89f, -79.81f, 16f, -159.62f, 151.64f, -151.64f)
                        curveTo(223.43f, 176.23f, 143.62f, 240.08f, 63.81f, 192.19f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 96f)
                        lineTo(40f, 216f)
                    }
                }.build()

        return _LeafDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LeafDuotone: ImageVector? = null
