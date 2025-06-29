package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ClockClockwiseLight: ImageVector
    get() {
        if (_ClockClockwiseLight != null) {
            return _ClockClockwiseLight!!
        }
        _ClockClockwiseLight =
            ImageVector
                .Builder(
                    name = "ClockClockwiseLight",
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
                        moveTo(128f, 80f)
                        lineToRelative(0f, 48f)
                        lineToRelative(40f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 104f)
                        lineToRelative(40f, 0f)
                        lineToRelative(0f, -40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(188.4f, 192f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.83f, -126.23f)
                        curveTo(202f, 77.69f, 211.72f, 88.93f, 224f, 104f)
                    }
                }.build()

        return _ClockClockwiseLight!!
    }

@Suppress("ObjectPropertyName")
private var _ClockClockwiseLight: ImageVector? = null
