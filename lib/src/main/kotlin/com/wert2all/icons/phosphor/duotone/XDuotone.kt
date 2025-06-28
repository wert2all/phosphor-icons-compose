package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.XDuotone: ImageVector
    get() {
        if (_XDuotone != null) {
            return _XDuotone!!
        }
        _XDuotone =
            ImageVector
                .Builder(
                    name = "XDuotone",
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
                        moveTo(56f, 40f)
                        lineTo(200f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 56f)
                        lineTo(216f, 200f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 216f)
                        lineTo(56f, 216f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 200f)
                        lineTo(40f, 56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 40f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 56f)
                        lineTo(56f, 200f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 200f)
                        lineTo(56f, 56f)
                    }
                }.build()

        return _XDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _XDuotone: ImageVector? = null
