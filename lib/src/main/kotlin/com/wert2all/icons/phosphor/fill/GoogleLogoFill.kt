package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.GoogleLogoFill: ImageVector
    get() {
        if (_GoogleLogoFill != null) {
            return _GoogleLogoFill!!
        }
        _GoogleLogoFill =
            ImageVector
                .Builder(
                    name = "GoogleLogoFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(128f, 208f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 181.34f, 68.37f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.67f, 11.92f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 191.5f, 136f)
                        lineTo(128f, 136f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        arcTo(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 208f)
                        close()
                    }
                }.build()

        return _GoogleLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleLogoFill: ImageVector? = null
