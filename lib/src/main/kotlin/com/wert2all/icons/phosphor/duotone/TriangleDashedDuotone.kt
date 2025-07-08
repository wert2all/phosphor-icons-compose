package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.TriangleDashedDuotone: ImageVector
    get() {
        if (_TriangleDashedDuotone != null) {
            return _TriangleDashedDuotone!!
        }
        _TriangleDashedDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.TriangleDashedDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(142.41f, 40.22f)
                        lineToRelative(87.46f, 151.87f)
                        curveTo(236f, 202.79f, 228.08f, 216f, 215.46f, 216f)
                        horizontalLineTo(40.54f)
                        curveTo(27.92f, 216f, 20f, 202.79f, 26.13f, 192.09f)
                        lineTo(113.59f, 40.22f)
                        curveTo(119.89f, 29.26f, 136.11f, 29.26f, 142.41f, 40.22f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 216f)
                        lineTo(104f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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
                        strokeLineWidth = 16f,
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
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(179.14f, 104f)
                        lineTo(202.18f, 144f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(53.82f, 144f)
                        lineTo(76.86f, 104f)
                    }
                }.build()

        return _TriangleDashedDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleDashedDuotone: ImageVector? = null
