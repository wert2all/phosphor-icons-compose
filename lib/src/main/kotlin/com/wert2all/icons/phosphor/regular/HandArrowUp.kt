package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.HandArrowUp: ImageVector
    get() {
        if (_HandArrowUp != null) {
            return _HandArrowUp!!
        }
        _HandArrowUp =
            ImageVector
                .Builder(
                    name = "Regular.HandArrowUp",
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
                        moveTo(48f, 208f)
                        horizontalLineTo(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(160f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineTo(48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 160f)
                        horizontalLineToRelative(32f)
                        lineToRelative(67f, -15.41f)
                        arcToRelative(16.61f, 16.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16f)
                        horizontalLineToRelative(0f)
                        arcToRelative(16.59f, 16.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.18f, 14.85f)
                        lineTo(184f, 192f)
                        lineToRelative(-64f, 16f)
                        horizontalLineTo(48f)
                        verticalLineTo(152f)
                        lineToRelative(25f, -25f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, -7f)
                        horizontalLineTo(140f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                        horizontalLineToRelative(0f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, 20f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 24f)
                        lineTo(192f, 104f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 56f)
                        lineToRelative(32f, -32f)
                        lineToRelative(32f, 32f)
                    }
                }.build()

        return _HandArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _HandArrowUp: ImageVector? = null
