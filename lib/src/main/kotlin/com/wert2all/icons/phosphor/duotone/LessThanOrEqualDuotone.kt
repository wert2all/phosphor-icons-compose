package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.LessThanOrEqualDuotone: ImageVector
    get() {
        if (_LessThanOrEqualDuotone != null) {
            return _LessThanOrEqualDuotone!!
        }
        _LessThanOrEqualDuotone =
            ImageVector
                .Builder(
                    name = "LessThanOrEqualDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(200f, 48f)
                        lineToRelative(-152f, 56f)
                        lineToRelative(152f, 56f)
                        lineToRelative(0f, -112f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 48f)
                        lineToRelative(-152f, 56f)
                        lineToRelative(152f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 200f)
                        lineTo(48f, 200f)
                    }
                }.build()

        return _LessThanOrEqualDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LessThanOrEqualDuotone: ImageVector? = null
