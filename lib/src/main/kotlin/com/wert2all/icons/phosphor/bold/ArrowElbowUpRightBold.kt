package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ArrowElbowUpRightBold: ImageVector
    get() {
        if (_ArrowElbowUpRightBold != null) {
            return _ArrowElbowUpRightBold!!
        }
        _ArrowElbowUpRightBold =
            ImageVector
                .Builder(
                    name = "ArrowElbowUpRightBold",
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
                        moveTo(168f, 128f)
                        lineToRelative(48f, -48f)
                        lineToRelative(-48f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 224f)
                        lineToRelative(0f, -144f)
                        lineToRelative(144f, 0f)
                    }
                }.build()

        return _ArrowElbowUpRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowUpRightBold: ImageVector? = null
