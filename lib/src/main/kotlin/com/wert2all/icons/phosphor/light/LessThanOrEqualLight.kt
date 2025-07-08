package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.LessThanOrEqualLight: ImageVector
    get() {
        if (_LessThanOrEqualLight != null) {
            return _LessThanOrEqualLight!!
        }
        _LessThanOrEqualLight =
            ImageVector
                .Builder(
                    name = "Light.LessThanOrEqualLight",
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
                        moveTo(200f, 48f)
                        lineToRelative(-152f, 56f)
                        lineToRelative(152f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 200f)
                        lineTo(48f, 200f)
                    }
                }.build()

        return _LessThanOrEqualLight!!
    }

@Suppress("ObjectPropertyName")
private var _LessThanOrEqualLight: ImageVector? = null
