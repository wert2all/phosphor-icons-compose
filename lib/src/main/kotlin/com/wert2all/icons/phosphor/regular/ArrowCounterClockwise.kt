package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.ArrowCounterClockwise: ImageVector
    get() {
        if (_ArrowCounterClockwise != null) {
            return _ArrowCounterClockwise!!
        }
        _ArrowCounterClockwise =
            ImageVector
                .Builder(
                    name = "ArrowCounterClockwise",
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
                        moveTo(24f, 56f)
                        lineToRelative(0f, 48f)
                        lineToRelative(48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(67.59f, 192f)
                        arcTo(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 65.77f, 65.77f)
                        lineTo(24f, 104f)
                    }
                }.build()

        return _ArrowCounterClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCounterClockwise: ImageVector? = null
