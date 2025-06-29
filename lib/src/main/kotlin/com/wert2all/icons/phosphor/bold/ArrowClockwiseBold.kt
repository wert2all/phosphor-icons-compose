package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ArrowClockwiseBold: ImageVector
    get() {
        if (_ArrowClockwiseBold != null) {
            return _ArrowClockwiseBold!!
        }
        _ArrowClockwiseBold =
            ImageVector
                .Builder(
                    name = "ArrowClockwiseBold",
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
                        moveTo(184f, 104f)
                        lineToRelative(48f, 0f)
                        lineToRelative(0f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(188.4f, 192f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.83f, -126.23f)
                        lineTo(232f, 104f)
                    }
                }.build()

        return _ArrowClockwiseBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowClockwiseBold: ImageVector? = null
