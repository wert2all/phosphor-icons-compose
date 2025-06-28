package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.LightningAThin: ImageVector
    get() {
        if (_LightningAThin != null) {
            return _LightningAThin!!
        }
        _LightningAThin =
            ImageVector
                .Builder(
                    name = "LightningAThin",
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
                        moveTo(127.2f, 24f)
                        lineToRelative(-15.2f, 64f)
                        lineToRelative(56f, 25.14f)
                        lineToRelative(-95.2f, 102.86f)
                        lineToRelative(15.2f, -64f)
                        lineToRelative(-56f, -25.14f)
                        lineToRelative(95.2f, -102.86f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(232f, 216f)
                        lineToRelative(-36f, -72f)
                        lineToRelative(-36f, 72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(220f, 192f)
                        lineTo(172f, 192f)
                    }
                }.build()

        return _LightningAThin!!
    }

@Suppress("ObjectPropertyName")
private var _LightningAThin: ImageVector? = null
