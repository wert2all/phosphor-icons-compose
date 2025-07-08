package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.AsclepiusBold: ImageVector
    get() {
        if (_AsclepiusBold != null) {
            return _AsclepiusBold!!
        }
        _AsclepiusBold =
            ImageVector
                .Builder(
                    name = "Bold.AsclepiusBold",
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
                        moveTo(128f, 24f)
                        lineTo(128f, 232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 48f)
                        verticalLineToRelative(8f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 88f)
                        horizontalLineTo(28f)
                        verticalLineTo(80f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, 48f)
                        horizontalLineTo(92f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(164f, 48f)
                        horizontalLineToRelative(17f)
                        arcToRelative(31f, 31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31f, 31f)
                        verticalLineToRelative(1f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                        horizontalLineTo(100f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
                        horizontalLineToRelative(0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 22.63f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(164f, 166.11f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 184f)
                        horizontalLineToRelative(0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                        horizontalLineTo(92f)
                    }
                }.build()

        return _AsclepiusBold!!
    }

@Suppress("ObjectPropertyName")
private var _AsclepiusBold: ImageVector? = null
