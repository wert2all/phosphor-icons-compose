package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.ArrowClockwiseLight: ImageVector
    get() {
        if (_ArrowClockwiseLight != null) {
            return _ArrowClockwiseLight!!
        }
        _ArrowClockwiseLight =
            ImageVector
                .Builder(
                    name = "Light.ArrowClockwiseLight",
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
                        moveTo(184f, 104f)
                        lineToRelative(48f, 0f)
                        lineToRelative(0f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(188.4f, 192f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.83f, -126.23f)
                        lineTo(232f, 104f)
                    }
                }.build()

        return _ArrowClockwiseLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowClockwiseLight: ImageVector? = null
