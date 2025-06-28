package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.MouseLeftClickFill: ImageVector
    get() {
        if (_MouseLeftClickFill != null) {
            return _MouseLeftClickFill!!
        }
        _MouseLeftClickFill =
            ImageVector
                .Builder(
                    name = "MouseLeftClickFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(144f, 16f)
                        lineTo(112f, 16f)
                        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 80f)
                        verticalLineToRelative(96f)
                        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
                        horizontalLineToRelative(32f)
                        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
                        lineTo(208f, 80f)
                        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 16f)
                        close()
                        moveTo(192f, 80f)
                        verticalLineToRelative(24f)
                        lineTo(128f, 104f)
                        lineTo(128f, 32f)
                        horizontalLineToRelative(16f)
                        arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 80f)
                        close()
                        moveTo(144f, 224f)
                        lineTo(112f, 224f)
                        arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
                        lineTo(64f, 120f)
                        lineTo(192f, 120f)
                        verticalLineToRelative(56f)
                        arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 224f)
                        close()
                    }
                }.build()

        return _MouseLeftClickFill!!
    }

@Suppress("ObjectPropertyName")
private var _MouseLeftClickFill: ImageVector? = null
