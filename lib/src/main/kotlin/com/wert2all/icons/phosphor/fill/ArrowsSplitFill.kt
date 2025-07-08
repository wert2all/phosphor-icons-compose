package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ArrowsSplitFill: ImageVector
    get() {
        if (_ArrowsSplitFill != null) {
            return _ArrowsSplitFill!!
        }
        _ArrowsSplitFill =
            ImageVector
                .Builder(
                    name = "Fill.ArrowsSplitFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(229.66f, 189.66f)
                        lineToRelative(-32f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-32f, -32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 176f)
                        horizontalLineToRelative(24f)
                        verticalLineTo(139.31f)
                        lineToRelative(-56f, -56f)
                        lineToRelative(-56f, 56f)
                        verticalLineTo(176f)
                        horizontalLineTo(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                        lineToRelative(-32f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-32f, -32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 176f)
                        horizontalLineTo(56f)
                        verticalLineTo(136f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.34f, -5.66f)
                        lineTo(120f, 68.69f)
                        verticalLineTo(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        verticalLineTo(68.69f)
                        lineToRelative(61.66f, 61.65f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 136f)
                        verticalLineToRelative(40f)
                        horizontalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                        close()
                    }
                }.build()

        return _ArrowsSplitFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsSplitFill: ImageVector? = null
