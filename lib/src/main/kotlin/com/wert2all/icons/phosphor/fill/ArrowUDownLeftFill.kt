package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowUDownLeftFill: ImageVector
    get() {
        if (_ArrowUDownLeftFill != null) {
            return _ArrowUDownLeftFill!!
        }
        _ArrowUDownLeftFill =
            ImageVector
                .Builder(
                    name = "ArrowUDownLeftFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(232f, 112f)
                        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 64f)
                        horizontalLineTo(88f)
                        verticalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                        lineToRelative(-48f, -48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                        lineToRelative(48f, -48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 120f)
                        verticalLineToRelative(40f)
                        horizontalLineToRelative(80f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -96f)
                        horizontalLineTo(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(88f)
                        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 112f)
                        close()
                    }
                }.build()

        return _ArrowUDownLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUDownLeftFill: ImageVector? = null
