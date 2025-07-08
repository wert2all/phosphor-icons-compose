package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.PulseBold: ImageVector
    get() {
        if (_PulseBold != null) {
            return _PulseBold!!
        }
        _PulseBold =
            ImageVector
                .Builder(
                    name = "Bold.PulseBold",
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
                        moveTo(24f, 128f)
                        lineToRelative(32f, 0f)
                        lineToRelative(40f, -88f)
                        lineToRelative(64f, 168f)
                        lineToRelative(40f, -80f)
                        lineToRelative(32f, 0f)
                    }
                }.build()

        return _PulseBold!!
    }

@Suppress("ObjectPropertyName")
private var _PulseBold: ImageVector? = null
