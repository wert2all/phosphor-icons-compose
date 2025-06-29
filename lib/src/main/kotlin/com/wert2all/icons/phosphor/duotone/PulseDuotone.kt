package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.PulseDuotone: ImageVector
    get() {
        if (_PulseDuotone != null) {
            return _PulseDuotone!!
        }
        _PulseDuotone =
            ImageVector
                .Builder(
                    name = "PulseDuotone",
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
                        moveTo(56f, 128f)
                        lineToRelative(40f, -88f)
                        lineToRelative(64f, 168f)
                        lineToRelative(40f, -80f)
                        lineToRelative(-144f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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

        return _PulseDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PulseDuotone: ImageVector? = null
