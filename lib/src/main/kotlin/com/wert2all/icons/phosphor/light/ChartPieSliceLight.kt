package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ChartPieSliceLight: ImageVector
    get() {
        if (_ChartPieSliceLight != null) {
            return _ChartPieSliceLight!!
        }
        _ChartPieSliceLight =
            ImageVector
                .Builder(
                    name = "ChartPieSliceLight",
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
                        moveTo(33.6f, 145.5f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 37.5f)
                        verticalLineToRelative(72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 128.42f)
                        verticalLineTo(32f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 45.22f, 176.64f)
                        close()
                    }
                }.build()

        return _ChartPieSliceLight!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieSliceLight: ImageVector? = null
