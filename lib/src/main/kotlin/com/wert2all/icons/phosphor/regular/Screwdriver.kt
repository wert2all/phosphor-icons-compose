package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Screwdriver: ImageVector
    get() {
        if (_Screwdriver != null) {
            return _Screwdriver!!
        }
        _Screwdriver =
            ImageVector
                .Builder(
                    name = "Regular.Screwdriver",
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
                        moveTo(200f, 56f)
                        lineTo(144f, 112f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(74.34f, 132.94f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                        lineToRelative(8f, -8f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 87.17f, 112f)
                        horizontalLineTo(104f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        verticalLineTo(87.31f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.34f, -5.65f)
                        lineToRelative(53.23f, -53.23f)
                        arcToRelative(42.42f, 42.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, 0f)
                        horizontalLineToRelative(0f)
                        arcToRelative(42.42f, 42.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 60f)
                        lineToRelative(-53.23f, 53.23f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.65f, 2.34f)
                        horizontalLineTo(152f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(16.83f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.62f, 4.83f)
                        lineToRelative(-8f, 8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(98.7f, 157.3f)
                        lineTo(16f, 240f)
                    }
                }.build()

        return _Screwdriver!!
    }

@Suppress("ObjectPropertyName")
private var _Screwdriver: ImageVector? = null
