package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.ControlBold: ImageVector
    get() {
        if (_ControlBold != null) {
            return _ControlBold!!
        }
        _ControlBold =
            ImageVector
                .Builder(
                    name = "Bold.ControlBold",
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
                        moveTo(56f, 120f)
                        lineToRelative(72f, -72f)
                        lineToRelative(72f, 72f)
                    }
                }.build()

        return _ControlBold!!
    }

@Suppress("ObjectPropertyName")
private var _ControlBold: ImageVector? = null
