package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.GreaterThanOrEqualDuotone: ImageVector
    get() {
        if (_GreaterThanOrEqualDuotone != null) {
            return _GreaterThanOrEqualDuotone!!
        }
        _GreaterThanOrEqualDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.GreaterThanOrEqualDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(56f, 48f)
                        lineToRelative(152f, 56f)
                        lineToRelative(-152f, 56f)
                        lineToRelative(0f, -112f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 48f)
                        lineToRelative(152f, 56f)
                        lineToRelative(-152f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 200f)
                        lineTo(56f, 200f)
                    }
                }.build()

        return _GreaterThanOrEqualDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThanOrEqualDuotone: ImageVector? = null
