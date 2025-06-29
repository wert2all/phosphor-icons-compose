package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CarrotDuotone: ImageVector
    get() {
        if (_CarrotDuotone != null) {
            return _CarrotDuotone!!
        }
        _CarrotDuotone =
            ImageVector
                .Builder(
                    name = "CarrotDuotone",
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
                        moveTo(43.81f, 223f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33f, 212.19f)
                        reflectiveCurveTo(64f, 112f, 104.4f, 72.4f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79.2f, 79.2f)
                        curveTo(144f, 192f, 43.81f, 223f, 43.81f, 223f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 32f)
                        lineTo(183.6f, 72.4f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(43.81f, 223f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33f, 212.19f)
                        reflectiveCurveTo(64f, 112f, 104.4f, 72.4f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79.2f, 79.2f)
                        curveTo(144f, 192f, 43.81f, 223f, 43.81f, 223f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(232f, 72f)
                        lineTo(183.19f, 72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 72.81f)
                        lineTo(184f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 152f)
                        lineTo(141.7f, 181.7f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104.4f, 72.4f)
                        lineTo(144f, 112f)
                    }
                }.build()

        return _CarrotDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CarrotDuotone: ImageVector? = null
