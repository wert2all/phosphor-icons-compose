package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.AlarmLight: ImageVector
    get() {
        if (_AlarmLight != null) {
            return _AlarmLight!!
        }
        _AlarmLight =
            ImageVector
                .Builder(
                    name = "Light.AlarmLight",
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
                        moveTo(128f, 136f)
                        moveToRelative(-88f, 0f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 176f, 0f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, -176f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 32f)
                        lineTo(24f, 64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 32f)
                        lineTo(232f, 64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 80f)
                        lineToRelative(0f, 56f)
                        lineToRelative(56f, 0f)
                    }
                }.build()

        return _AlarmLight!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmLight: ImageVector? = null
