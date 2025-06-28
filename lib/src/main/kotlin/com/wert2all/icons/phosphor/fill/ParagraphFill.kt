package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ParagraphFill: ImageVector
    get() {
        if (_ParagraphFill != null) {
            return _ParagraphFill!!
        }
        _ParagraphFill =
            ImageVector
                .Builder(
                    name = "ParagraphFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(216f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(192f)
                        verticalLineTo(208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(56f)
                        horizontalLineTo(152f)
                        verticalLineTo(208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(168f)
                        horizontalLineTo(96f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 40f)
                        horizontalLineTo(208f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                        close()
                    }
                }.build()

        return _ParagraphFill!!
    }

@Suppress("ObjectPropertyName")
private var _ParagraphFill: ImageVector? = null
