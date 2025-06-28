package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ArrowSquareInDuotone: ImageVector
    get() {
        if (_ArrowSquareInDuotone != null) {
            return _ArrowSquareInDuotone!!
        }
        _ArrowSquareInDuotone =
            ImageVector
                .Builder(
                    name = "ArrowSquareInDuotone",
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
                        moveTo(80f, 40f)
                        lineTo(208f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                        lineTo(216f, 176f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 184f)
                        lineTo(80f, 184f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 176f)
                        lineTo(72f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(120f, 200f)
                        lineToRelative(-0.01f, -63.99f)
                        lineToRelative(-63.99f, -0.01f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 184f)
                        horizontalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        verticalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        horizontalLineTo(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineTo(96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 216f)
                        lineTo(120f, 136f)
                    }
                }.build()

        return _ArrowSquareInDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSquareInDuotone: ImageVector? = null
