package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.NeedleLight: ImageVector
    get() {
        if (_NeedleLight != null) {
            return _NeedleLight!!
        }
        _NeedleLight =
            ImageVector
                .Builder(
                    name = "Light.NeedleLight",
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
                        moveTo(184f, 72f)
                        lineTo(168f, 88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(182.63f, 118.63f)
                        lineToRelative(24f, -24f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, -45.26f)
                        lineToRelative(-24f, 24f)
                        curveTo(128f, 128f, 40f, 216f, 40f, 216f)
                        reflectiveCurveTo(128f, 128f, 182.63f, 118.63f)
                        close()
                    }
                }.build()

        return _NeedleLight!!
    }

@Suppress("ObjectPropertyName")
private var _NeedleLight: ImageVector? = null
