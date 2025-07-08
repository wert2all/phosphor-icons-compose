package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.LightningLight: ImageVector
    get() {
        if (_LightningLight != null) {
            return _LightningLight!!
        }
        _LightningLight =
            ImageVector
                .Builder(
                    name = "Light.LightningLight",
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

        return _LightningLight!!
    }

@Suppress("ObjectPropertyName")
private var _LightningLight: ImageVector? = null
