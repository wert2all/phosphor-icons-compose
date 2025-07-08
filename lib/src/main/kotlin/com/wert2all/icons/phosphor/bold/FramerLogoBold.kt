package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.FramerLogoBold: ImageVector
    get() {
        if (_FramerLogoBold != null) {
            return _FramerLogoBold!!
        }
        _FramerLogoBold =
            ImageVector
                .Builder(
                    name = "Bold.FramerLogoBold",
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

        return _FramerLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _FramerLogoBold: ImageVector? = null
