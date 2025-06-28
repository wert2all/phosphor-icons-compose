package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ArrowFatLeftLight: ImageVector
    get() {
        if (_ArrowFatLeftLight != null) {
            return _ArrowFatLeftLight!!
        }
        _ArrowFatLeftLight =
            ImageVector
                .Builder(
                    name = "ArrowFatLeftLight",
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
                        moveTo(120f, 32f)
                        lineTo(24f, 128f)
                        lineToRelative(96f, 96f)
                        verticalLineTo(176f)
                        horizontalLineToRelative(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        verticalLineTo(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        horizontalLineTo(120f)
                        close()
                    }
                }.build()

        return _ArrowFatLeftLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLeftLight: ImageVector? = null
