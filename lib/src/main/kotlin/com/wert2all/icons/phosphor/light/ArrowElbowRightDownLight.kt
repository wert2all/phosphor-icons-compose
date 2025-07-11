package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.ArrowElbowRightDownLight: ImageVector
    get() {
        if (_ArrowElbowRightDownLight != null) {
            return _ArrowElbowRightDownLight!!
        }
        _ArrowElbowRightDownLight =
            ImageVector
                .Builder(
                    name = "Light.ArrowElbowRightDownLight",
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
                        moveTo(128f, 160f)
                        lineToRelative(48f, 48f)
                        lineToRelative(48f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 64f)
                        lineToRelative(144f, 0f)
                        lineToRelative(0f, 144f)
                    }
                }.build()

        return _ArrowElbowRightDownLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightDownLight: ImageVector? = null
