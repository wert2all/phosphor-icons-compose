package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.LightningBold: ImageVector
    get() {
        if (_LightningBold != null) {
            return _LightningBold!!
        }
        _LightningBold =
            ImageVector
                .Builder(
                    name = "Bold.LightningBold",
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
                        moveTo(160f, 16f)
                        lineToRelative(-12f, 80f)
                        lineToRelative(60f, 24f)
                        lineToRelative(-112f, 120f)
                        lineToRelative(12f, -80f)
                        lineToRelative(-60f, -24f)
                        lineToRelative(112f, -120f)
                        close()
                    }
                }.build()

        return _LightningBold!!
    }

@Suppress("ObjectPropertyName")
private var _LightningBold: ImageVector? = null
