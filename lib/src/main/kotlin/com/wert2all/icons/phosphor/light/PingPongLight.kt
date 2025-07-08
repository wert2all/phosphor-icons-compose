package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.PingPongLight: ImageVector
    get() {
        if (_PingPongLight != null) {
            return _PingPongLight!!
        }
        _PingPongLight =
            ImageVector
                .Builder(
                    name = "Light.PingPongLight",
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
                        moveTo(134.58f, 206.59f)
                        arcTo(31.78f, 31.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106f, 215.41f)
                        curveTo(63.4f, 207f, 31.38f, 167.92f, 32f, 122.69f)
                        curveToRelative(0.69f, -49.55f, 41.13f, -90f, 90.68f, -90.68f)
                        curveToRelative(45.23f, -0.63f, 84.27f, 31.39f, 92.72f, 74f)
                        arcToRelative(31.78f, 31.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.82f, 28.58f)
                        lineTo(183f, 158.21f)
                        lineToRelative(45.69f, 32.64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 12.16f)
                        lineTo(203f, 229.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.16f, -1f)
                        lineTo(158.21f, 183f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(206.6f, 81.4f)
                        lineTo(81.4f, 206.6f)
                    }
                }.build()

        return _PingPongLight!!
    }

@Suppress("ObjectPropertyName")
private var _PingPongLight: ImageVector? = null
