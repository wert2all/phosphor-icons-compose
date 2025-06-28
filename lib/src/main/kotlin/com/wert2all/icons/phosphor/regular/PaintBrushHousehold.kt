package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.PaintBrushHousehold: ImageVector
    get() {
        if (_PaintBrushHousehold != null) {
            return _PaintBrushHousehold!!
        }
        _PaintBrushHousehold =
            ImageVector
                .Builder(
                    name = "PaintBrushHousehold",
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
                        moveTo(72f, 104f)
                        lineTo(152f, 184f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(44f, 188f)
                        lineTo(72f, 160f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(68f, 212f)
                        lineTo(96f, 184f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(156f, 124f)
                        lineToRelative(16.69f, 16.69f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22.62f)
                        lineTo(96f, 240f)
                        lineTo(16f, 160f)
                        lineTo(92.69f, 83.31f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 0f)
                        lineTo(132f, 100f)
                        lineToRelative(59f, -69f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 225f, 65f)
                        close()
                    }
                }.build()

        return _PaintBrushHousehold!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushHousehold: ImageVector? = null
