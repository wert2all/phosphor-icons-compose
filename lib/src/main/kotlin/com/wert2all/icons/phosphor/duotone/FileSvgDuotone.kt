package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.FileSvgDuotone: ImageVector
    get() {
        if (_FileSvgDuotone != null) {
            return _FileSvgDuotone!!
        }
        _FileSvgDuotone =
            ImageVector
                .Builder(
                    name = "FileSvgDuotone",
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
                        moveTo(152f, 32f)
                        lineToRelative(0f, 56f)
                        lineToRelative(56f, 0f)
                        lineToRelative(-56f, -56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 112f)
                        verticalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(96f)
                        lineToRelative(56f, 56f)
                        verticalLineToRelative(24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 32f)
                        lineToRelative(0f, 56f)
                        lineToRelative(56f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(75.9f, 153.6f)
                        reflectiveCurveToRelative(-29.43f, -7.78f, -31.8f, 11f)
                        reflectiveCurveToRelative(38.43f, 10.12f, 35.78f, 30.72f)
                        curveToRelative(-2.47f, 19.16f, -31.78f, 11f, -31.78f, 11f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 152f)
                        lineToRelative(20f, 56f)
                        lineToRelative(20f, -56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 184f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(16.87f)
                        arcTo(22.12f, 22.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 208f)
                        curveToRelative(-13.25f, 0f, -24f, -12.54f, -24f, -28f)
                        reflectiveCurveToRelative(10.75f, -28f, 24f, -28f)
                        arcToRelative(21.28f, 21.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.75f)
                    }
                }.build()

        return _FileSvgDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FileSvgDuotone: ImageVector? = null
