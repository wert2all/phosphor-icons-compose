package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.FileSqlLight: ImageVector
    get() {
        if (_FileSqlLight != null) {
            return _FileSqlLight!!
        }
        _FileSqlLight =
            ImageVector
                .Builder(
                    name = "FileSqlLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
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
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 32f)
                        lineToRelative(0f, 56f)
                        lineToRelative(56f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(220f, 208f)
                        lineToRelative(-28f, 0f)
                        lineToRelative(0f, -56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(79.9f, 153.6f)
                        reflectiveCurveToRelative(-29.43f, -7.78f, -31.8f, 11f)
                        reflectiveCurveToRelative(38.43f, 10.12f, 35.78f, 30.72f)
                        curveToRelative(-2.47f, 19.16f, -31.78f, 11f, -31.78f, 11f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 180f)
                        arcToRelative(24f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 0f)
                        arcToRelative(24f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -48f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 192f)
                        lineTo(160f, 208f)
                    }
                }.build()

        return _FileSqlLight!!
    }

@Suppress("ObjectPropertyName")
private var _FileSqlLight: ImageVector? = null
