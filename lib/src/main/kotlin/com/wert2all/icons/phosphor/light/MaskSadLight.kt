package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.MaskSadLight: ImageVector
    get() {
        if (_MaskSadLight != null) {
            return _MaskSadLight!!
        }
        _MaskSadLight =
            ImageVector
                .Builder(
                    name = "Light.MaskSadLight",
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
                        moveTo(152f, 184f)
                        curveToRelative(-7.6f, -5.05f, -14.19f, -8f, -24f, -8f)
                        reflectiveCurveToRelative(-16.4f, 2.95f, -24f, 8f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 120f)
                        curveToRelative(4.39f, 4.91f, 12.89f, 8f, 20f, 8f)
                        reflectiveCurveToRelative(15.61f, -3.09f, 20f, -8f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.89f, -7.47f)
                        curveTo(190f, 46.41f, 160.89f, 55.71f, 128f, 55.71f)
                        reflectiveCurveToRelative(-62f, -9.3f, -77.11f, -15.16f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 48f)
                        verticalLineToRelative(55.77f)
                        curveTo(40f, 174.6f, 79.4f, 232f, 128f, 232f)
                        reflectiveCurveToRelative(88f, -57.4f, 88f, -128.21f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 120f)
                        curveToRelative(4.39f, 4.91f, 12.89f, 8f, 20f, 8f)
                        reflectiveCurveToRelative(15.61f, -3.09f, 20f, -8f)
                    }
                }.build()

        return _MaskSadLight!!
    }

@Suppress("ObjectPropertyName")
private var _MaskSadLight: ImageVector? = null
