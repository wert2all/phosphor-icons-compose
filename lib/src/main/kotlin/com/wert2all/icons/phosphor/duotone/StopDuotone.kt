package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.StopDuotone: ImageVector
    get() {
        if (_StopDuotone != null) {
            return _StopDuotone!!
        }
        _StopDuotone =
            ImageVector
                .Builder(
                    name = "StopDuotone",
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
                        moveTo(56f, 48f)
                        lineTo(200f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 56f)
                        lineTo(208f, 200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 208f)
                        lineTo(56f, 208f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 200f)
                        lineTo(48f, 56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 48f)
                        lineTo(200f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 56f)
                        lineTo(208f, 200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 208f)
                        lineTo(56f, 208f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 200f)
                        lineTo(48f, 56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 48f)
                        close()
                    }
                }.build()

        return _StopDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StopDuotone: ImageVector? = null
