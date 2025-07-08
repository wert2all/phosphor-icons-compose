package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.PlayPauseBold: ImageVector
    get() {
        if (_PlayPauseBold != null) {
            return _PlayPauseBold!!
        }
        _PlayPauseBold =
            ImageVector
                .Builder(
                    name = "Bold.PlayPauseBold",
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
                        moveTo(176f, 64f)
                        lineTo(176f, 192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 64f)
                        lineTo(224f, 192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 71.85f)
                        verticalLineToRelative(112.3f)
                        arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 6.59f)
                        lineToRelative(88.19f, -56.15f)
                        arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.18f)
                        lineTo(44.18f, 65.26f)
                        arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 71.85f)
                        close()
                    }
                }.build()

        return _PlayPauseBold!!
    }

@Suppress("ObjectPropertyName")
private var _PlayPauseBold: ImageVector? = null
