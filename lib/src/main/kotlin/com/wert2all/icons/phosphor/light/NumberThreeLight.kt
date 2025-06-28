package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.NumberThreeLight: ImageVector
    get() {
        if (_NumberThreeLight != null) {
            return _NumberThreeLight!!
        }
        _NumberThreeLight =
            ImageVector
                .Builder(
                    name = "NumberThreeLight",
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
                        moveTo(88f, 48f)
                        horizontalLineToRelative(80f)
                        lineToRelative(-48f, 64f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 83.78f)
                    }
                }.build()

        return _NumberThreeLight!!
    }

@Suppress("ObjectPropertyName")
private var _NumberThreeLight: ImageVector? = null
