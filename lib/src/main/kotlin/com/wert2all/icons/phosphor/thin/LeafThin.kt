package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.LeafThin: ImageVector
    get() {
        if (_LeafThin != null) {
            return _LeafThin!!
        }
        _LeafThin =
            ImageVector
                .Builder(
                    name = "Thin.LeafThin",
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
                        moveTo(63.81f, 192.19f)
                        curveToRelative(-47.89f, -79.81f, 16f, -159.62f, 151.64f, -151.64f)
                        curveTo(223.43f, 176.23f, 143.62f, 240.08f, 63.81f, 192.19f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 96f)
                        lineTo(40f, 216f)
                    }
                }.build()

        return _LeafThin!!
    }

@Suppress("ObjectPropertyName")
private var _LeafThin: ImageVector? = null
