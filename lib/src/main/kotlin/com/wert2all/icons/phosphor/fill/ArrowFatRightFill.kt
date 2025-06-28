package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowFatRightFill: ImageVector
    get() {
        if (_ArrowFatRightFill != null) {
            return _ArrowFatRightFill!!
        }
        _ArrowFatRightFill =
            ImageVector
                .Builder(
                    name = "ArrowFatRightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(132.94f, 231.39f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 224f)
                        verticalLineTo(184f)
                        horizontalLineTo(48f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        verticalLineTo(88f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 72f)
                        horizontalLineToRelative(80f)
                        verticalLineTo(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                        lineToRelative(96f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                        lineToRelative(-96f, 96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132.94f, 231.39f)
                        close()
                    }
                }.build()

        return _ArrowFatRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatRightFill: ImageVector? = null
