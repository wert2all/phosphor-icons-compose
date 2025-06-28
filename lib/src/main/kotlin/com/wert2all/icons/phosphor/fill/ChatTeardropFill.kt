package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ChatTeardropFill: ImageVector
    get() {
        if (_ChatTeardropFill != null) {
            return _ChatTeardropFill!!
        }
        _ChatTeardropFill =
            ImageVector
                .Builder(
                    name = "ChatTeardropFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(232f, 124f)
                        arcTo(100.11f, 100.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 224f)
                        horizontalLineTo(48f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        verticalLineTo(124f)
                        arcToRelative(100f, 100f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 0f)
                        close()
                    }
                }.build()

        return _ChatTeardropFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatTeardropFill: ImageVector? = null
