package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.RocketBold: ImageVector
    get() {
        if (_RocketBold != null) {
            return _RocketBold!!
        }
        _RocketBold =
            ImageVector
                .Builder(
                    name = "Bold.RocketBold",
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
                        moveTo(144f, 228f)
                        lineTo(112f, 228f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 100f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(94.81f, 192f)
                        curveTo(37.52f, 95.32f, 103.87f, 32.53f, 123.09f, 17.68f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.82f, 0f)
                        curveTo(152.13f, 32.53f, 218.48f, 95.32f, 161.19f, 192f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(183.84f, 110.88f)
                        lineToRelative(30.31f, 36.36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.66f, 6.86f)
                        lineToRelative(-12.36f, 55.63f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.81f, 4.51f)
                        lineTo(161.19f, 192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72.16f, 110.88f)
                        lineTo(41.85f, 147.24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, 6.86f)
                        lineToRelative(12.36f, 55.63f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.81f, 4.51f)
                        lineTo(94.81f, 192f)
                    }
                }.build()

        return _RocketBold!!
    }

@Suppress("ObjectPropertyName")
private var _RocketBold: ImageVector? = null
