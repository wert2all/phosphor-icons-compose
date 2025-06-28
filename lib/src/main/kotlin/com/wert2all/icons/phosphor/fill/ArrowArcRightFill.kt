package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowArcRightFill: ImageVector
    get() {
        if (_ArrowArcRightFill != null) {
            return _ArrowArcRightFill!!
        }
        _ArrowArcRightFill =
            ImageVector
                .Builder(
                    name = "ArrowArcRightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(240f, 88f)
                        verticalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                        lineToRelative(26.19f, -26.18f)
                        arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 184f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 175.86f, -75.18f)
                        lineToRelative(26.48f, -26.48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 88f)
                        close()
                    }
                }.build()

        return _ArrowArcRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowArcRightFill: ImageVector? = null
