package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.EjectSimpleLight: ImageVector
    get() {
        if (_EjectSimpleLight != null) {
            return _EjectSimpleLight!!
        }
        _EjectSimpleLight =
            ImageVector
                .Builder(
                    name = "EjectSimpleLight",
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
                        moveTo(224f, 200f)
                        lineTo(32f, 200f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(33.82f, 138.8f)
                        lineTo(115.48f, 38f)
                        arcToRelative(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25f, 0f)
                        lineTo(222.18f, 138.8f)
                        arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.26f, 13.2f)
                        horizontalLineTo(40.08f)
                        arcTo(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.82f, 138.8f)
                        close()
                    }
                }.build()

        return _EjectSimpleLight!!
    }

@Suppress("ObjectPropertyName")
private var _EjectSimpleLight: ImageVector? = null
