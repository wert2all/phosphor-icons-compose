package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.PaintBrush: ImageVector
    get() {
        if (_PaintBrush != null) {
            return _PaintBrush!!
        }
        _PaintBrush =
            ImageVector
                .Builder(
                    name = "PaintBrush",
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
                        moveTo(16f, 216f)
                        horizontalLineTo(92f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = false, -52f, -52f)
                        curveTo(40f, 200f, 16f, 216f, 16f, 216f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112.41f, 116.16f)
                        curveTo(131.6f, 90.29f, 179.46f, 32f, 224f, 32f)
                        curveToRelative(0f, 44.54f, -58.29f, 92.4f, -84.16f, 111.59f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(133f, 90.64f)
                        arcToRelative(84.39f, 84.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.41f, 32.41f)
                    }
                }.build()

        return _PaintBrush!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrush: ImageVector? = null
