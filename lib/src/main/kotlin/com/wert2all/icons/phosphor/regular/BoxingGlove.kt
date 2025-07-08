package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.BoxingGlove: ImageVector
    get() {
        if (_BoxingGlove != null) {
            return _BoxingGlove!!
        }
        _BoxingGlove =
            ImageVector
                .Builder(
                    name = "Regular.BoxingGlove",
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
                        verticalLineTo(72f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, -48f)
                        horizontalLineToRelative(48f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
                        verticalLineToRelative(46.88f)
                        arcToRelative(7.85f, 7.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.31f, 2.2f)
                        lineTo(200f, 176f)
                        verticalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(176f)
                        lineTo(33.75f, 138.19f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.75f, -5f)
                        verticalLineTo(104f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 80f)
                        horizontalLineTo(72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 160f)
                        lineTo(168f, 192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 160f)
                        lineTo(104f, 192f)
                    }
                }.build()

        return _BoxingGlove!!
    }

@Suppress("ObjectPropertyName")
private var _BoxingGlove: ImageVector? = null
