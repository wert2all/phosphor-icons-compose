package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.WindLight: ImageVector
    get() {
        if (_WindLight != null) {
            return _WindLight!!
        }
        _WindLight =
            ImageVector
                .Builder(
                    name = "Light.WindLight",
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
                        moveTo(128f, 192f)
                        curveToRelative(3.39f, 9.15f, 13.67f, 16f, 24f, 16f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -48f)
                        horizontalLineTo(40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 64f)
                        curveToRelative(3.39f, -9.15f, 13.67f, -16f, 24f, -16f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                        horizontalLineTo(24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 96f)
                        curveToRelative(3.39f, -9.15f, 13.67f, -16f, 24f, -16f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                        horizontalLineTo(32f)
                    }
                }.build()

        return _WindLight!!
    }

@Suppress("ObjectPropertyName")
private var _WindLight: ImageVector? = null
