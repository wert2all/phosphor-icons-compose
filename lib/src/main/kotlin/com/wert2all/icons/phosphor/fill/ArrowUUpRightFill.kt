package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowUUpRightFill: ImageVector
    get() {
        if (_ArrowUUpRightFill != null) {
            return _ArrowUUpRightFill!!
        }
        _ArrowUUpRightFill =
            ImageVector
                .Builder(
                    name = "ArrowUUpRightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(168f, 136f)
                        verticalLineTo(96f)
                        horizontalLineTo(88f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 96f)
                        horizontalLineToRelative(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        horizontalLineTo(88f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 80f)
                        horizontalLineToRelative(80f)
                        verticalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                        lineToRelative(48f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                        lineToRelative(-48f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 136f)
                        close()
                    }
                }.build()

        return _ArrowUUpRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUUpRightFill: ImageVector? = null
