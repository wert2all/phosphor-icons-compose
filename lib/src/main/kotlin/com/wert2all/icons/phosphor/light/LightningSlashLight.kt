package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.LightningSlashLight: ImageVector
    get() {
        if (_LightningSlashLight != null) {
            return _LightningSlashLight!!
        }
        _LightningSlashLight =
            ImageVector
                .Builder(
                    name = "Light.LightningSlashLight",
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
                        moveTo(48f, 40f)
                        lineTo(208f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(114.12f, 65.16f)
                        lineToRelative(45.88f, -49.16f)
                        lineToRelative(-16f, 80f)
                        lineToRelative(64f, 24f)
                        lineToRelative(-22.3f, 23.9f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(163.79f, 167.37f)
                        lineToRelative(-67.79f, 72.63f)
                        lineToRelative(16f, -80f)
                        lineToRelative(-64f, -24f)
                        lineToRelative(44.21f, -47.37f)
                    }
                }.build()

        return _LightningSlashLight!!
    }

@Suppress("ObjectPropertyName")
private var _LightningSlashLight: ImageVector? = null
