package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.SquaresFourLight: ImageVector
    get() {
        if (_SquaresFourLight != null) {
            return _SquaresFourLight!!
        }
        _SquaresFourLight =
            ImageVector
                .Builder(
                    name = "SquaresFourLight",
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
                        moveTo(56f, 48f)
                        lineTo(104f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 56f)
                        lineTo(112f, 104f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 112f)
                        lineTo(56f, 112f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 104f)
                        lineTo(48f, 56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 48f)
                        lineTo(200f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 56f)
                        lineTo(208f, 104f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 112f)
                        lineTo(152f, 112f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 104f)
                        lineTo(144f, 56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 144f)
                        lineTo(104f, 144f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 152f)
                        lineTo(112f, 200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 208f)
                        lineTo(56f, 208f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 200f)
                        lineTo(48f, 152f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 144f)
                        lineTo(200f, 144f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 152f)
                        lineTo(208f, 200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 208f)
                        lineTo(152f, 208f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 200f)
                        lineTo(144f, 152f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 144f)
                        close()
                    }
                }.build()

        return _SquaresFourLight!!
    }

@Suppress("ObjectPropertyName")
private var _SquaresFourLight: ImageVector? = null
