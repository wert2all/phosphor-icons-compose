package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.TextHSixFill: ImageVector
    get() {
        if (_TextHSixFill != null) {
            return _TextHSixFill!!
        }
        _TextHSixFill =
            ImageVector
                .Builder(
                    name = "TextHSixFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(192f, 152f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, -16f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 152f)
                        close()
                        moveTo(224f, 48f)
                        lineTo(224f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        lineTo(48f, 224f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        lineTo(32f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                        lineTo(208f, 32f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                        close()
                        moveTo(128f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                        verticalLineToRelative(32f)
                        lineTo(72f, 112f)
                        lineTo(72f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                        verticalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(72f, 128f)
                        horizontalLineToRelative(40f)
                        verticalLineToRelative(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        close()
                        moveTo(208f, 152f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
                        lineToRelative(11.55f, -20f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.86f, -8f)
                        lineToRelative(-25.4f, 44f)
                        lineToRelative(-0.14f, 0.27f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 208f, 152f)
                        close()
                    }
                }.build()

        return _TextHSixFill!!
    }

@Suppress("ObjectPropertyName")
private var _TextHSixFill: ImageVector? = null
