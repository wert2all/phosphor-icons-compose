package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.LightningThin: ImageVector
    get() {
        if (_LightningThin != null) {
            return _LightningThin!!
        }
        _LightningThin =
            ImageVector
                .Builder(
                    name = "LightningThin",
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
                        moveTo(160f, 16f)
                        lineToRelative(-16f, 80f)
                        lineToRelative(64f, 24f)
                        lineToRelative(-112f, 120f)
                        lineToRelative(16f, -80f)
                        lineToRelative(-64f, -24f)
                        lineToRelative(112f, -120f)
                        close()
                    }
                }.build()

        return _LightningThin!!
    }

@Suppress("ObjectPropertyName")
private var _LightningThin: ImageVector? = null
