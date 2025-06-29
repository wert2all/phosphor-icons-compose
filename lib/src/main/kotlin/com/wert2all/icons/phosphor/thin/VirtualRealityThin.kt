package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.VirtualRealityThin: ImageVector
    get() {
        if (_VirtualRealityThin != null) {
            return _VirtualRealityThin!!
        }
        _VirtualRealityThin =
            ImageVector
                .Builder(
                    name = "VirtualRealityThin",
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
                        moveTo(68f, 96f)
                        lineToRelative(24f, 64f)
                        lineToRelative(24f, -64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 56f)
                        lineTo(176f, 56f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 128f)
                        lineTo(248f, 128f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 200f)
                        lineTo(80f, 200f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 128f)
                        lineTo(8f, 128f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 136f)
                        horizontalLineToRelative(20f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -40f)
                        horizontalLineTo(144f)
                        verticalLineToRelative(64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 160f)
                        lineTo(169.8f, 135.15f)
                    }
                }.build()

        return _VirtualRealityThin!!
    }

@Suppress("ObjectPropertyName")
private var _VirtualRealityThin: ImageVector? = null
