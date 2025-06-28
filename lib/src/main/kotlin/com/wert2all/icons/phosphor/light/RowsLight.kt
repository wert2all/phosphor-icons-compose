package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.RowsLight: ImageVector
    get() {
        if (_RowsLight != null) {
            return _RowsLight!!
        }
        _RowsLight =
            ImageVector
                .Builder(
                    name = "RowsLight",
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
                        moveTo(48f, 144f)
                        lineTo(208f, 144f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 152f)
                        lineTo(216f, 192f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 200f)
                        lineTo(48f, 200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
                        lineTo(40f, 152f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 56f)
                        lineTo(208f, 56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 64f)
                        lineTo(216f, 104f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 112f)
                        lineTo(48f, 112f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 104f)
                        lineTo(40f, 64f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 56f)
                        close()
                    }
                }.build()

        return _RowsLight!!
    }

@Suppress("ObjectPropertyName")
private var _RowsLight: ImageVector? = null
