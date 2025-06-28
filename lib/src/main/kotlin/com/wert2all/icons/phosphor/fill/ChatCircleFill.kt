package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ChatCircleFill: ImageVector
    get() {
        if (_ChatCircleFill != null) {
            return _ChatCircleFill!!
        }
        _ChatCircleFill =
            ImageVector
                .Builder(
                    name = "ChatCircleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(232f, 128f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79.12f, 219.82f)
                        lineTo(45.07f, 231.17f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20.24f, -20.24f)
                        lineToRelative(11.35f, -34.05f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 232f, 128f)
                        close()
                    }
                }.build()

        return _ChatCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatCircleFill: ImageVector? = null
