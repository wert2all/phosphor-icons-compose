package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.GiftLight: ImageVector
    get() {
        if (_GiftLight != null) {
            return _GiftLight!!
        }
        _GiftLight =
            ImageVector
                .Builder(
                    name = "GiftLight",
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
                        moveTo(40f, 80f)
                        lineTo(216f, 80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 88f)
                        lineTo(224f, 120f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 128f)
                        lineTo(40f, 128f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 120f)
                        lineTo(32f, 88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 80f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 128f)
                        verticalLineToRelative(72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 80f)
                        lineTo(128f, 208f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176.79f, 31.21f)
                        curveToRelative(9.34f, 9.34f, 9.89f, 25.06f, 0f, 33.82f)
                        curveTo(159.88f, 80f, 128f, 80f, 128f, 80f)
                        reflectiveCurveToRelative(0f, -31.88f, 15f, -48.79f)
                        curveTo(151.73f, 21.32f, 167.45f, 21.87f, 176.79f, 31.21f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(79.21f, 31.21f)
                        curveToRelative(-9.34f, 9.34f, -9.89f, 25.06f, 0f, 33.82f)
                        curveTo(96.12f, 80f, 128f, 80f, 128f, 80f)
                        reflectiveCurveToRelative(0f, -31.88f, -15f, -48.79f)
                        curveTo(104.27f, 21.32f, 88.55f, 21.87f, 79.21f, 31.21f)
                        close()
                    }
                }.build()

        return _GiftLight!!
    }

@Suppress("ObjectPropertyName")
private var _GiftLight: ImageVector? = null
