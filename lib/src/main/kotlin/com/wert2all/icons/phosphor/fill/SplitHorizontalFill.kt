package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.SplitHorizontalFill: ImageVector
    get() {
        if (_SplitHorizontalFill != null) {
            return _SplitHorizontalFill!!
        }
        _SplitHorizontalFill =
            ImageVector
                .Builder(
                    name = "Fill.SplitHorizontalFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(112f, 48f)
                        lineTo(112f, 208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        lineTo(96f, 136f)
                        lineTo(64f, 136f)
                        verticalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                        lineToRelative(-32f, -32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                        lineToRelative(32f, -32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 96f)
                        verticalLineToRelative(24f)
                        lineTo(96f, 120f)
                        lineTo(96f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                        moveTo(237.66f, 122.34f)
                        lineTo(205.66f, 90.34f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 96f)
                        verticalLineToRelative(24f)
                        lineTo(160f, 120f)
                        lineTo(160f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                        lineTo(144f, 208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(160f, 136f)
                        horizontalLineToRelative(32f)
                        verticalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                        lineToRelative(32f, -32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 237.66f, 122.34f)
                        close()
                    }
                }.build()

        return _SplitHorizontalFill!!
    }

@Suppress("ObjectPropertyName")
private var _SplitHorizontalFill: ImageVector? = null
