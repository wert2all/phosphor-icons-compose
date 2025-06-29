package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.GreaterThanLight: ImageVector
    get() {
        if (_GreaterThanLight != null) {
            return _GreaterThanLight!!
        }
        _GreaterThanLight =
            ImageVector
                .Builder(
                    name = "GreaterThanLight",
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
                        moveTo(64f, 56f)
                        lineToRelative(152f, 72f)
                        lineToRelative(-152f, 72f)
                    }
                }.build()

        return _GreaterThanLight!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThanLight: ImageVector? = null
