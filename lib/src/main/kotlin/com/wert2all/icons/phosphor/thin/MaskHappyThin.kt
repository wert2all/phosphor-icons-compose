package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.MaskHappyThin: ImageVector
    get() {
        if (_MaskHappyThin != null) {
            return _MaskHappyThin!!
        }
        _MaskHappyThin =
            ImageVector
                .Builder(
                    name = "MaskHappyThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 128f)
                        curveToRelative(4.39f, -4.91f, 12.89f, -8f, 20f, -8f)
                        reflectiveCurveToRelative(15.61f, 3.09f, 20f, 8f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 128f)
                        curveToRelative(4.39f, -4.91f, 12.89f, -8f, 20f, -8f)
                        reflectiveCurveToRelative(15.61f, 3.09f, 20f, 8f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(162.36f, 168f)
                        arcToRelative(44.89f, 44.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -68.72f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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
                }.build()

        return _MaskHappyThin!!
    }

@Suppress("ObjectPropertyName")
private var _MaskHappyThin: ImageVector? = null
