package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.SquareHalfFill: ImageVector
    get() {
        if (_SquareHalfFill != null) {
            return _SquareHalfFill!!
        }
        _SquareHalfFill =
            ImageVector
                .Builder(
                    name = "SquareHalfFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(200f, 40f)
                        horizontalLineTo(56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 56f)
                        verticalLineTo(200f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineTo(200f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        verticalLineTo(56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 40f)
                        close()
                        moveTo(56f, 56f)
                        horizontalLineToRelative(72f)
                        verticalLineTo(200f)
                        horizontalLineTo(56f)
                        close()
                    }
                }.build()

        return _SquareHalfFill!!
    }

@Suppress("ObjectPropertyName")
private var _SquareHalfFill: ImageVector? = null
