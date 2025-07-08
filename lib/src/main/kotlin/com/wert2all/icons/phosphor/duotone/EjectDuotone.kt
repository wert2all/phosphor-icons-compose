package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.EjectDuotone: ImageVector
    get() {
        if (_EjectDuotone != null) {
            return _EjectDuotone!!
        }
        _EjectDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.EjectDuotone",
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
                        moveTo(40f, 192f)
                        lineTo(40f, 168f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 160f)
                        lineTo(208f, 160f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 168f)
                        lineTo(216f, 192f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 200f)
                        lineTo(48f, 200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(42.19f, 114.63f)
                        lineToRelative(73.74f, -77.5f)
                        arcToRelative(16.76f, 16.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.14f, 0f)
                        lineToRelative(73.74f, 77.5f)
                        curveToRelative(4.85f, 5.1f, 1.12f, 13.37f, -6f, 13.37f)
                        horizontalLineTo(48.23f)
                        curveTo(41.07f, 128f, 37.34f, 119.73f, 42.19f, 114.63f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 192f)
                        lineTo(40f, 168f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 160f)
                        lineTo(208f, 160f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 168f)
                        lineTo(216f, 192f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 200f)
                        lineTo(48f, 200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(42.19f, 114.63f)
                        lineToRelative(73.74f, -77.5f)
                        arcToRelative(16.76f, 16.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.14f, 0f)
                        lineToRelative(73.74f, 77.5f)
                        curveToRelative(4.85f, 5.1f, 1.12f, 13.37f, -6f, 13.37f)
                        horizontalLineTo(48.23f)
                        curveTo(41.07f, 128f, 37.34f, 119.73f, 42.19f, 114.63f)
                        close()
                    }
                }.build()

        return _EjectDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _EjectDuotone: ImageVector? = null
