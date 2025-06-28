package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ArrowElbowRightUpBold: ImageVector
    get() {
        if (_ArrowElbowRightUpBold != null) {
            return _ArrowElbowRightUpBold!!
        }
        _ArrowElbowRightUpBold =
            ImageVector
                .Builder(
                    name = "ArrowElbowRightUpBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(120f, 96f)
                        lineToRelative(48f, -48f)
                        lineToRelative(48f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 192f)
                        lineToRelative(144f, 0f)
                        lineToRelative(0f, -144f)
                    }
                }.build()

        return _ArrowElbowRightUpBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightUpBold: ImageVector? = null
