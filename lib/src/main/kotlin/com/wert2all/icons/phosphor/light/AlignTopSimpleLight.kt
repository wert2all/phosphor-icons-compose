package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.AlignTopSimpleLight: ImageVector
    get() {
        if (_AlignTopSimpleLight != null) {
            return _AlignTopSimpleLight!!
        }
        _AlignTopSimpleLight =
            ImageVector
                .Builder(
                    name = "AlignTopSimpleLight",
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
                        moveTo(56f, 32f)
                        lineTo(200f, 32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 64f)
                        lineTo(160f, 64f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 72f)
                        lineTo(168f, 224f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 232f)
                        lineTo(96f, 232f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 224f)
                        lineTo(88f, 72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 64f)
                        close()
                    }
                }.build()

        return _AlignTopSimpleLight!!
    }

@Suppress("ObjectPropertyName")
private var _AlignTopSimpleLight: ImageVector? = null
