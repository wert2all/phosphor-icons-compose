package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ReplitLogoFill: ImageVector
    get() {
        if (_ReplitLogoFill != null) {
            return _ReplitLogoFill!!
        }
        _ReplitLogoFill =
            ImageVector
                .Builder(
                    name = "ReplitLogoFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(72f, 160f)
                        horizontalLineToRelative(72f)
                        verticalLineToRelative(56f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        lineTo(72f, 232f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        lineTo(56f, 176f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 160f)
                        close()
                        moveTo(128f, 24f)
                        lineTo(72f, 24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                        lineTo(56f, 80f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 96f)
                        horizontalLineToRelative(72f)
                        lineTo(144f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(216f, 96f)
                        lineTo(144f, 96f)
                        verticalLineToRelative(64f)
                        horizontalLineToRelative(72f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(232f, 112f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 96f)
                        close()
                    }
                }.build()

        return _ReplitLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _ReplitLogoFill: ImageVector? = null
