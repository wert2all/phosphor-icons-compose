package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.TextHOneFill: ImageVector
    get() {
        if (_TextHOneFill != null) {
            return _TextHOneFill!!
        }
        _TextHOneFill =
            ImageVector
                .Builder(
                    name = "TextHOneFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(208f, 32f)
                        lineTo(48f, 32f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                        lineTo(32f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(208f, 224f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(224f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                        close()
                        moveTo(144f, 160f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        lineTo(128f, 128f)
                        lineTo(72f, 128f)
                        verticalLineToRelative(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        lineTo(56f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        verticalLineToRelative(32f)
                        horizontalLineToRelative(56f)
                        lineTo(128f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                        moveTo(200f, 176f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        lineTo(184f, 111f)
                        lineToRelative(-11.56f, 7.71f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8.88f, -13.32f)
                        lineToRelative(24f, -16f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 96f)
                        close()
                    }
                }.build()

        return _TextHOneFill!!
    }

@Suppress("ObjectPropertyName")
private var _TextHOneFill: ImageVector? = null
