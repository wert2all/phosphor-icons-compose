package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowFatLinesUpFill: ImageVector
    get() {
        if (_ArrowFatLinesUpFill != null) {
            return _ArrowFatLinesUpFill!!
        }
        _ArrowFatLinesUpFill =
            ImageVector
                .Builder(
                    name = "ArrowFatLinesUpFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(231.39f, 123.06f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                        lineTo(184f, 128f)
                        verticalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        lineTo(80f, 160f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        lineTo(72f, 128f)
                        lineTo(32f, 128f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                        lineToRelative(96f, -96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                        lineToRelative(96f, 96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.39f, 123.06f)
                        close()
                        moveTo(176f, 208f)
                        lineTo(80f, 208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                        close()
                        moveTo(176f, 176f)
                        lineTo(80f, 176f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                        close()
                    }
                }.build()

        return _ArrowFatLinesUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesUpFill: ImageVector? = null
