package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.PottedPlantDuotone: ImageVector
    get() {
        if (_PottedPlantDuotone != null) {
            return _PottedPlantDuotone!!
        }
        _PottedPlantDuotone =
            ImageVector
                .Builder(
                    name = "PottedPlantDuotone",
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
                        moveTo(184f, 152f)
                        lineToRelative(-14.61f, 65.74f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.81f, 6.26f)
                        horizontalLineTo(94.42f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.81f, -6.26f)
                        lineTo(72f, 152f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144.28f, 111.72f)
                        curveToRelative(-25.08f, -41.81f, 8.36f, -83.61f, 79.43f, -79.43f)
                        curveTo(227.89f, 103.36f, 186.09f, 136.8f, 144.28f, 111.72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(98f, 114f)
                        curveToRelative(18.24f, -30.41f, -6.08f, -60.81f, -57.77f, -57.77f)
                        curveTo(37.17f, 107.9f, 67.57f, 132.22f, 98f, 114f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 152f)
                        lineTo(200f, 152f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 152f)
                        lineToRelative(-14.61f, 65.74f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.81f, 6.26f)
                        horizontalLineTo(94.42f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.81f, -6.26f)
                        lineTo(72f, 152f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144.28f, 111.72f)
                        lineTo(104f, 152f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(97.98f, 113.98f)
                        lineTo(120f, 136f)
                    }
                }.build()

        return _PottedPlantDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PottedPlantDuotone: ImageVector? = null
