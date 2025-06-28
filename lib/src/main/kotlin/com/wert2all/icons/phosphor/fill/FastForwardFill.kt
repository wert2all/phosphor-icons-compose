package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.FastForwardFill: ImageVector
    get() {
        if (_FastForwardFill != null) {
            return _FastForwardFill!!
        }
        _FastForwardFill =
            ImageVector
                .Builder(
                    name = "FastForwardFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(256f, 128f)
                        arcToRelative(15.76f, 15.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.33f, 13.34f)
                        lineTo(160.48f, 197.5f)
                        arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 184.16f)
                        verticalLineToRelative(-37.3f)
                        lineTo(56.48f, 197.5f)
                        arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 184.16f)
                        verticalLineTo(71.84f)
                        arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56.48f, 58.5f)
                        lineTo(136f, 109.14f)
                        verticalLineTo(71.84f)
                        arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160.48f, 58.5f)
                        lineToRelative(88.19f, 56.16f)
                        arcTo(15.76f, 15.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 128f)
                        close()
                    }
                }.build()

        return _FastForwardFill!!
    }

@Suppress("ObjectPropertyName")
private var _FastForwardFill: ImageVector? = null
