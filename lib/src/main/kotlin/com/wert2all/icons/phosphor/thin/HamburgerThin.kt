package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.HamburgerThin: ImageVector
    get() {
        if (_HamburgerThin != null) {
            return _HamburgerThin!!
        }
        _HamburgerThin =
            ImageVector
                .Builder(
                    name = "Thin.HamburgerThin",
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
                        moveTo(48.07f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.89f, -9.72f)
                        curveTo(46.68f, 55.55f, 83.52f, 32f, 128f, 32f)
                        reflectiveCurveToRelative(81.32f, 23.55f, 87.82f, 54.28f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 207.93f, 96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 176f)
                        lineToRelative(44f, -16f)
                        lineToRelative(40f, 16f)
                        lineToRelative(40f, -16f)
                        lineToRelative(40f, 16f)
                        lineToRelative(44f, -16f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 128f)
                        lineTo(232f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 168.73f)
                        verticalLineTo(184f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                        horizontalLineTo(80f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
                        verticalLineTo(167.27f)
                    }
                }.build()

        return _HamburgerThin!!
    }

@Suppress("ObjectPropertyName")
private var _HamburgerThin: ImageVector? = null
