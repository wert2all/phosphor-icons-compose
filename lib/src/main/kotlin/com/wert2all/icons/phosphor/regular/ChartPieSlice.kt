package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.ChartPieSlice: ImageVector
    get() {
        if (_ChartPieSlice != null) {
            return _ChartPieSlice!!
        }
        _ChartPieSlice =
            ImageVector
                .Builder(
                    name = "Regular.ChartPieSlice",
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
                        moveTo(33.6f, 145.5f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 37.5f)
                        verticalLineToRelative(72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 128.42f)
                        verticalLineTo(32f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 45.22f, 176.64f)
                        close()
                    }
                }.build()

        return _ChartPieSlice!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieSlice: ImageVector? = null
