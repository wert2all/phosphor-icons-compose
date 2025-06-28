package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.FramerLogoDuotone: ImageVector
    get() {
        if (_FramerLogoDuotone != null) {
            return _FramerLogoDuotone!!
        }
        _FramerLogoDuotone =
            ImageVector
                .Builder(
                    name = "FramerLogoDuotone",
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
                        moveTo(56f, 104f)
                        lineToRelative(0f, 64f)
                        lineToRelative(72f, 72f)
                        lineToRelative(0f, -72f)
                        lineToRelative(72f, 0f)
                        lineToRelative(-144f, -128f)
                        lineToRelative(144f, 0f)
                        lineToRelative(0f, 64f)
                        lineToRelative(-144f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 104f)
                        lineToRelative(0f, 64f)
                        lineToRelative(72f, 72f)
                        lineToRelative(0f, -72f)
                        lineToRelative(72f, 0f)
                        lineToRelative(-144f, -128f)
                        lineToRelative(144f, 0f)
                        lineToRelative(0f, 64f)
                        lineToRelative(-144f, 0f)
                        close()
                    }
                }.build()

        return _FramerLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FramerLogoDuotone: ImageVector? = null
