package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.AlignRight: ImageVector
    get() {
        if (_AlignRight != null) {
            return _AlignRight!!
        }
        _AlignRight =
            ImageVector
                .Builder(
                    name = "Regular.AlignRight",
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
                        moveTo(216f, 40f)
                        lineTo(216f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 112f)
                        lineTo(80f, 112f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 104f)
                        lineTo(72f, 64f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 56f)
                        lineTo(176f, 56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 64f)
                        lineTo(184f, 104f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 112f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 144f)
                        lineTo(176f, 144f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 152f)
                        lineTo(184f, 192f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 200f)
                        lineTo(40f, 200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 192f)
                        lineTo(32f, 152f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 144f)
                        close()
                    }
                }.build()

        return _AlignRight!!
    }

@Suppress("ObjectPropertyName")
private var _AlignRight: ImageVector? = null
