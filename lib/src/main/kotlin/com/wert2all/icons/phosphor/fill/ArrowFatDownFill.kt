package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowFatDownFill: ImageVector
    get() {
        if (_ArrowFatDownFill != null) {
            return _ArrowFatDownFill!!
        }
        _ArrowFatDownFill =
            ImageVector
                .Builder(
                    name = "ArrowFatDownFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(229.66f, 141.66f)
                        lineToRelative(-96f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-96f, -96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 128f)
                        horizontalLineTo(72f)
                        verticalLineTo(48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 32f)
                        horizontalLineToRelative(80f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                        verticalLineToRelative(80f)
                        horizontalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                        close()
                    }
                }.build()

        return _ArrowFatDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatDownFill: ImageVector? = null
