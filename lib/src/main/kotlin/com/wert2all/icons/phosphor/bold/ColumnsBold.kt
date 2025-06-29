package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ColumnsBold: ImageVector
    get() {
        if (_ColumnsBold != null) {
            return _ColumnsBold!!
        }
        _ColumnsBold =
            ImageVector
                .Builder(
                    name = "ColumnsBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(108f, 48f)
                        lineTo(108f, 208f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 216f)
                        lineTo(64f, 216f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 208f)
                        lineTo(56f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 40f)
                        lineTo(100f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, 48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 48f)
                        lineTo(200f, 208f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 216f)
                        lineTo(156f, 216f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 208f)
                        lineTo(148f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 40f)
                        lineTo(192f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 48f)
                        close()
                    }
                }.build()

        return _ColumnsBold!!
    }

@Suppress("ObjectPropertyName")
private var _ColumnsBold: ImageVector? = null
