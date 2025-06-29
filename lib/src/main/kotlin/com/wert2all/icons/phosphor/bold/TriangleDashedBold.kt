package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.TriangleDashedBold: ImageVector
    get() {
        if (_TriangleDashedBold != null) {
            return _TriangleDashedBold!!
        }
        _TriangleDashedBold =
            ImageVector
                .Builder(
                    name = "TriangleDashedBold",
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
                        moveTo(152f, 216f)
                        lineTo(104f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(225.21f, 184f)
                        lineToRelative(4.66f, 8.09f)
                        curveTo(236f, 202.79f, 228.08f, 216f, 215.46f, 216f)
                        horizontalLineTo(192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 216f)
                        horizontalLineTo(40.54f)
                        curveTo(27.92f, 216f, 20f, 202.79f, 26.13f, 192.09f)
                        lineTo(30.79f, 184f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(179.14f, 104f)
                        lineTo(202.18f, 144f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(99.89f, 64f)
                        lineToRelative(13.7f, -23.78f)
                        curveToRelative(6.3f, -11f, 22.52f, -11f, 28.82f, 0f)
                        lineTo(156.11f, 64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(53.82f, 144f)
                        lineTo(76.86f, 104f)
                    }
                }.build()

        return _TriangleDashedBold!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleDashedBold: ImageVector? = null
