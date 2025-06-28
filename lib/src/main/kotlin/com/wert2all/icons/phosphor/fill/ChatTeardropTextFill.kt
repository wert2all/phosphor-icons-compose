package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ChatTeardropTextFill: ImageVector
    get() {
        if (_ChatTeardropTextFill != null) {
            return _ChatTeardropTextFill!!
        }
        _ChatTeardropTextFill =
            ImageVector
                .Builder(
                    name = "ChatTeardropTextFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(132f, 24f)
                        arcTo(100.11f, 100.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 124f)
                        verticalLineToRelative(84f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineToRelative(84f)
                        arcToRelative(100f, 100f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -200f)
                        close()
                        moveTo(164f, 152f)
                        lineTo(96f, 152f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(68f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        close()
                        moveTo(164f, 120f)
                        lineTo(96f, 120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(68f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        close()
                    }
                }.build()

        return _ChatTeardropTextFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatTeardropTextFill: ImageVector? = null
