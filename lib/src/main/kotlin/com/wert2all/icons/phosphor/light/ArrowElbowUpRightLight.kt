package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ArrowElbowUpRightLight: ImageVector
    get() {
        if (_ArrowElbowUpRightLight != null) {
            return _ArrowElbowUpRightLight!!
        }
        _ArrowElbowUpRightLight =
            ImageVector
                .Builder(
                    name = "ArrowElbowUpRightLight",
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
                        moveTo(168f, 128f)
                        lineToRelative(48f, -48f)
                        lineToRelative(-48f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 224f)
                        lineToRelative(0f, -144f)
                        lineToRelative(144f, 0f)
                    }
                }.build()

        return _ArrowElbowUpRightLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowUpRightLight: ImageVector? = null
