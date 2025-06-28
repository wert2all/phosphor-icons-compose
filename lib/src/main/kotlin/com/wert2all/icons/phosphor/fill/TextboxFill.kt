package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.TextboxFill: ImageVector
    get() {
        if (_TextboxFill != null) {
            return _TextboxFill!!
        }
        _TextboxFill =
            ImageVector
                .Builder(
                    name = "TextboxFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(248f, 80f)
                        verticalLineToRelative(96f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        horizontalLineTo(140f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                        verticalLineTo(68f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                        horizontalLineToRelative(92f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 80f)
                        close()
                        moveTo(120f, 48f)
                        verticalLineTo(208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(192f)
                        horizontalLineTo(24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 176f)
                        verticalLineTo(80f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 64f)
                        horizontalLineToRelative(80f)
                        verticalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                        moveTo(88f, 112f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(120f)
                        horizontalLineToRelative(8f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 112f)
                        close()
                    }
                }.build()

        return _TextboxFill!!
    }

@Suppress("ObjectPropertyName")
private var _TextboxFill: ImageVector? = null
