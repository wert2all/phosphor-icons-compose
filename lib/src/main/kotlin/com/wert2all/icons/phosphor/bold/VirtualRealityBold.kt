package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.VirtualRealityBold: ImageVector
    get() {
        if (_VirtualRealityBold != null) {
            return _VirtualRealityBold!!
        }
        _VirtualRealityBold =
            ImageVector
                .Builder(
                    name = "Bold.VirtualRealityBold",
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
                        moveTo(68f, 100f)
                        lineToRelative(24f, 56f)
                        lineToRelative(24f, -56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(84f, 56f)
                        lineTo(172f, 56f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 244f, 128f)
                        lineTo(244f, 128f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 200f)
                        lineTo(84f, 200f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 128f)
                        lineTo(12f, 128f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(148f, 140f)
                        horizontalLineToRelative(20f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -40f)
                        horizontalLineTo(148f)
                        verticalLineToRelative(56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(188f, 156f)
                        lineTo(175.53f, 138.54f)
                    }
                }.build()

        return _VirtualRealityBold!!
    }

@Suppress("ObjectPropertyName")
private var _VirtualRealityBold: ImageVector? = null
