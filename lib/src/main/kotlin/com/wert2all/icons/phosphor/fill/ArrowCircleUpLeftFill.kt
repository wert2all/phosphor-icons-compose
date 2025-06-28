package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowCircleUpLeftFill: ImageVector
    get() {
        if (_ArrowCircleUpLeftFill != null) {
            return _ArrowCircleUpLeftFill!!
        }
        _ArrowCircleUpLeftFill =
            ImageVector
                .Builder(
                    name = "ArrowCircleUpLeftFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(165.66f, 165.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineTo(104f, 115.31f)
                        lineTo(104f, 144f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        lineTo(88f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        lineTo(115.31f, 104f)
                        lineToRelative(50.35f, 50.34f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.66f, 165.66f)
                        close()
                    }
                }.build()

        return _ArrowCircleUpLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleUpLeftFill: ImageVector? = null
