package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.LightningA: ImageVector
    get() {
        if (_LightningA != null) {
            return _LightningA!!
        }
        _LightningA =
            ImageVector
                .Builder(
                    name = "Regular.LightningA",
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
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(232f, 216f)
                        lineToRelative(-36f, -72f)
                        lineToRelative(-36f, 72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(220f, 192f)
                        lineTo(172f, 192f)
                    }
                }.build()

        return _LightningA!!
    }

@Suppress("ObjectPropertyName")
private var _LightningA: ImageVector? = null
