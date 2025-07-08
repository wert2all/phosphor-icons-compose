package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.NumberTwoLight: ImageVector
    get() {
        if (_NumberTwoLight != null) {
            return _NumberTwoLight!!
        }
        _NumberTwoLight =
            ImageVector
                .Builder(
                    name = "Light.NumberTwoLight",
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
                        moveTo(91.33f, 72f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68.61f, 40.07f)
                        lineTo(88f, 208f)
                        horizontalLineToRelative(80f)
                    }
                }.build()

        return _NumberTwoLight!!
    }

@Suppress("ObjectPropertyName")
private var _NumberTwoLight: ImageVector? = null
