package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowElbowUpLeftFill: ImageVector
    get() {
        if (_ArrowElbowUpLeftFill != null) {
            return _ArrowElbowUpLeftFill!!
        }
        _ArrowElbowUpLeftFill =
            ImageVector
                .Builder(
                    name = "ArrowElbowUpLeftFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(200f, 80f)
                        verticalLineTo(224f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(88f)
                        horizontalLineTo(104f)
                        verticalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                        lineToRelative(-48f, -48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                        lineToRelative(48f, -48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 32f)
                        verticalLineTo(72f)
                        horizontalLineToRelative(88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 80f)
                        close()
                    }
                }.build()

        return _ArrowElbowUpLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowUpLeftFill: ImageVector? = null
