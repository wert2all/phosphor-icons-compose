package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.TildeDuotone: ImageVector
    get() {
        if (_TildeDuotone != null) {
            return _TildeDuotone!!
        }
        _TildeDuotone =
            ImageVector
                .Builder(
                    name = "TildeDuotone",
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
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 130.42f)
                        curveToRelative(72f, -89.55f, 104f, 84.71f, 176f, -4.84f)
                    }
                }.build()

        return _TildeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TildeDuotone: ImageVector? = null
