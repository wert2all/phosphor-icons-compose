package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.CursorTextFill: ImageVector
    get() {
        if (_CursorTextFill != null) {
            return _CursorTextFill!!
        }
        _CursorTextFill =
            ImageVector
                .Builder(
                    name = "Fill.CursorTextFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
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
                        moveTo(144f, 120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        horizontalLineToRelative(-8f)
                        verticalLineToRelative(24f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineToRelative(8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        horizontalLineToRelative(-8f)
                        arcToRelative(31.92f, 31.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -10.87f)
                        arcTo(31.92f, 31.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 192f)
                        lineTo(96f, 192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(8f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(120f, 136f)
                        horizontalLineToRelative(-8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(8f)
                        lineTo(120f, 96f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                        lineTo(96f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(8f)
                        arcToRelative(31.92f, 31.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10.87f)
                        arcTo(31.92f, 31.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 64f)
                        horizontalLineToRelative(8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        horizontalLineToRelative(-8f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                        verticalLineToRelative(24f)
                        close()
                    }
                }.build()

        return _CursorTextFill!!
    }

@Suppress("ObjectPropertyName")
private var _CursorTextFill: ImageVector? = null
