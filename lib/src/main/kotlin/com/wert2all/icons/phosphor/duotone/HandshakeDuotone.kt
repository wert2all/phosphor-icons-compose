package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.HandshakeDuotone: ImageVector
    get() {
        if (_HandshakeDuotone != null) {
            return _HandshakeDuotone!!
        }
        _HandshakeDuotone =
            ImageVector
                .Builder(
                    name = "HandshakeDuotone",
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
                        moveTo(99.72f, 128.71f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.38f, -12.42f)
                        lineTo(144f, 72f)
                        horizontalLineToRelative(39.6f)
                        lineToRelative(-0.28f, -1.37f)
                        lineTo(128f, 56f)
                        lineTo(72.68f, 70.63f)
                        lineTo(40f, 136f)
                        lineToRelative(56f, 40f)
                        lineToRelative(64f, 16f)
                        lineToRelative(40f, -40f)
                        lineToRelative(-40f, -32f)
                        curveTo(141f, 139.13f, 117.23f, 139.9f, 99.72f, 128.71f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 152f)
                        lineToRelative(-40f, 40f)
                        lineToRelative(-64f, -16f)
                        lineToRelative(-56f, -40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72.68f, 70.63f)
                        lineToRelative(55.32f, -14.63f)
                        lineToRelative(55.32f, 14.63f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(34.37f, 60.42f)
                        lineTo(8.85f, 111.48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, 10.73f)
                        lineTo(40f, 136f)
                        lineTo(72.68f, 70.63f)
                        lineTo(45.11f, 56.85f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.37f, 60.42f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 136f)
                        lineToRelative(27.58f, -13.79f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, -10.73f)
                        lineTo(221.63f, 60.42f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.74f, -3.57f)
                        lineTo(183.32f, 70.63f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 72f)
                        horizontalLineTo(144f)
                        lineTo(98.34f, 116.29f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, 12.42f)
                        curveTo(117.23f, 139.9f, 141f, 139.13f, 160f, 120f)
                        lineToRelative(40f, 32f)
                        lineToRelative(16f, -16f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(124.06f, 216f)
                        lineToRelative(-41.72f, -10.43f)
                        lineToRelative(-26.34f, -18.82f)
                    }
                }.build()

        return _HandshakeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HandshakeDuotone: ImageVector? = null
