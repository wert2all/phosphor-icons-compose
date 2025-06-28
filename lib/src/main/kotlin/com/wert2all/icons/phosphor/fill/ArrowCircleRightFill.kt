package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowCircleRightFill: ImageVector
    get() {
        if (_ArrowCircleRightFill != null) {
            return _ArrowCircleRightFill!!
        }
        _ArrowCircleRightFill =
            ImageVector
                .Builder(
                    name = "ArrowCircleRightFill",
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
                        moveTo(173.66f, 133.66f)
                        lineTo(141.66f, 165.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                        lineTo(148.69f, 136f)
                        lineTo(88f, 136f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(60.69f)
                        lineToRelative(-18.35f, -18.34f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                        lineToRelative(32f, 32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 173.66f, 133.66f)
                        close()
                    }
                }.build()

        return _ArrowCircleRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleRightFill: ImageVector? = null
