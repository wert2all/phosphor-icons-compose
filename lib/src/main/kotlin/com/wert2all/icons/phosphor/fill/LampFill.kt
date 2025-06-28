package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.LampFill: ImageVector
    get() {
        if (_LampFill != null) {
            return _LampFill!!
        }
        _LampFill =
            ImageVector
                .Builder(
                    name = "LampFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(246.68f, 156.4f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 160f)
                        horizontalLineTo(208f)
                        verticalLineToRelative(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(160f)
                        horizontalLineTo(136f)
                        verticalLineToRelative(48f)
                        horizontalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        horizontalLineTo(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(24f)
                        verticalLineTo(160f)
                        horizontalLineTo(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.35f, -11.15f)
                        lineToRelative(48f, -112f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 32f)
                        horizontalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.35f, 4.85f)
                        lineToRelative(48f, 112f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 246.68f, 156.4f)
                        close()
                    }
                }.build()

        return _LampFill!!
    }

@Suppress("ObjectPropertyName")
private var _LampFill: ImageVector? = null
