package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.NumberZeroLight: ImageVector
    get() {
        if (_NumberZeroLight != null) {
            return _NumberZeroLight!!
        }
        _NumberZeroLight =
            ImageVector
                .Builder(
                    name = "NumberZeroLight",
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
                        moveTo(64f, 128f)
                        arcToRelative(64f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 0f)
                        arcToRelative(64f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, -128f, 0f)
                        close()
                    }
                }.build()

        return _NumberZeroLight!!
    }

@Suppress("ObjectPropertyName")
private var _NumberZeroLight: ImageVector? = null
