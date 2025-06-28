package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowULeftDownFill: ImageVector
    get() {
        if (_ArrowULeftDownFill != null) {
            return _ArrowULeftDownFill!!
        }
        _ArrowULeftDownFill =
            ImageVector
                .Builder(
                    name = "ArrowULeftDownFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(208f, 88f)
                        verticalLineToRelative(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(88f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 0f)
                        verticalLineToRelative(80f)
                        horizontalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                        lineToRelative(-48f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-48f, -48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 168f)
                        horizontalLineTo(80f)
                        verticalLineTo(88f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 0f)
                        close()
                    }
                }.build()

        return _ArrowULeftDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowULeftDownFill: ImageVector? = null
