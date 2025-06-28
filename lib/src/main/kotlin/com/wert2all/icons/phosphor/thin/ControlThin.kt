package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.ControlThin: ImageVector
    get() {
        if (_ControlThin != null) {
            return _ControlThin!!
        }
        _ControlThin =
            ImageVector
                .Builder(
                    name = "ControlThin",
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
                        moveTo(56f, 120f)
                        lineToRelative(72f, -72f)
                        lineToRelative(72f, 72f)
                    }
                }.build()

        return _ControlThin!!
    }

@Suppress("ObjectPropertyName")
private var _ControlThin: ImageVector? = null
