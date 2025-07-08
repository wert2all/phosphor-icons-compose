package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.GuitarBold: ImageVector
    get() {
        if (_GuitarBold != null) {
            return _GuitarBold!!
        }
        _GuitarBold =
            ImageVector
                .Builder(
                    name = "Bold.GuitarBold",
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
                        moveTo(60.07f, 112f)
                        arcToRelative(16.23f, 16.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.72f, -10f)
                        arcTo(34.21f, 34.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 82.4f, 90.4f)
                        curveToRelative(17.23f, -17.23f, 49.82f, -12.57f, 72.8f, 10.4f)
                        reflectiveCurveToRelative(27.63f, 55.57f, 10.4f, 72.8f)
                        arcToRelative(34.21f, 34.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.66f, 7.61f)
                        arcToRelative(16.23f, 16.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, 14.72f)
                        curveTo(143.56f, 208f, 139.39f, 219f, 131.2f, 227.2f)
                        curveTo(110f, 248.4f, 69.88f, 242.67f, 41.6f, 214.4f)
                        reflectiveCurveTo(7.6f, 146f, 28.8f, 124.8f)
                        curveTo(37f, 116.61f, 48f, 112.44f, 60.07f, 112f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(60f, 172f)
                        lineTo(84f, 196f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(112f, 144f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(204f, 12f)
                        lineTo(244f, 52f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(174f, 54f)
                        lineTo(202f, 82f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(139.39f, 88.61f)
                        lineTo(210f, 18f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(167.39f, 116.61f)
                        lineTo(238f, 46f)
                    }
                }.build()

        return _GuitarBold!!
    }

@Suppress("ObjectPropertyName")
private var _GuitarBold: ImageVector? = null
