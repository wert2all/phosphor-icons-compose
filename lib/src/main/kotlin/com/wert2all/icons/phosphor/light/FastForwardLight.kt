package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.FastForwardLight: ImageVector
    get() {
        if (_FastForwardLight != null) {
            return _FastForwardLight!!
        }
        _FastForwardLight =
            ImageVector
                .Builder(
                    name = "Light.FastForwardLight",
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
                        moveTo(40f, 71.85f)
                        verticalLineToRelative(112.3f)
                        arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 6.59f)
                        lineToRelative(88.19f, -56.15f)
                        arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.18f)
                        lineTo(52.18f, 65.26f)
                        arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 71.85f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 71.85f)
                        verticalLineToRelative(112.3f)
                        arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 6.59f)
                        lineToRelative(88.19f, -56.15f)
                        arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.18f)
                        lineTo(156.18f, 65.26f)
                        arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 71.85f)
                        close()
                    }
                }.build()

        return _FastForwardLight!!
    }

@Suppress("ObjectPropertyName")
private var _FastForwardLight: ImageVector? = null
