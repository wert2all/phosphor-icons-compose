package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Scribble: ImageVector
    get() {
        if (_Scribble != null) {
            return _Scribble!!
        }
        _Scribble =
            ImageVector
                .Builder(
                    name = "Regular.Scribble",
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
                        moveTo(88f, 40f)
                        lineTo(46.63f, 81.37f)
                        arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 32f)
                        horizontalLineToRelative(0f)
                        arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 0f)
                        lineToRelative(66.74f, -66.74f)
                        arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                        horizontalLineToRelative(0f)
                        arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
                        lineTo(78.63f, 177.37f)
                        arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 32f)
                        horizontalLineToRelative(0f)
                        arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 0f)
                        lineToRelative(66.74f, -66.74f)
                        arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                        horizontalLineToRelative(0f)
                        arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
                        lineTo(200f, 184f)
                        arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 32f)
                        horizontalLineToRelative(0f)
                    }
                }.build()

        return _Scribble!!
    }

@Suppress("ObjectPropertyName")
private var _Scribble: ImageVector? = null
