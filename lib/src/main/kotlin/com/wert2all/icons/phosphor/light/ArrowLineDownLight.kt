package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.ArrowLineDownLight: ImageVector
    get() {
        if (_ArrowLineDownLight != null) {
            return _ArrowLineDownLight!!
        }
        _ArrowLineDownLight =
            ImageVector
                .Builder(
                    name = "Light.ArrowLineDownLight",
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
                        moveTo(128f, 32f)
                        lineTo(128f, 184f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 112f)
                        lineToRelative(72f, 72f)
                        lineToRelative(72f, -72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 216f)
                        lineTo(216f, 216f)
                    }
                }.build()

        return _ArrowLineDownLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLineDownLight: ImageVector? = null
