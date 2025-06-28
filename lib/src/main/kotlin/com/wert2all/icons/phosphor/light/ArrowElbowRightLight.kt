package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ArrowElbowRightLight: ImageVector
    get() {
        if (_ArrowElbowRightLight != null) {
            return _ArrowElbowRightLight!!
        }
        _ArrowElbowRightLight =
            ImageVector
                .Builder(
                    name = "ArrowElbowRightLight",
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
                        moveTo(160f, 80f)
                        lineToRelative(72f, 0f)
                        lineToRelative(0f, 72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 96f)
                        lineToRelative(96f, 96f)
                        lineToRelative(112f, -112f)
                    }
                }.build()

        return _ArrowElbowRightLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightLight: ImageVector? = null
