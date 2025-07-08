package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ArrowDownLeftFill: ImageVector
    get() {
        if (_ArrowDownLeftFill != null) {
            return _ArrowDownLeftFill!!
        }
        _ArrowDownLeftFill =
            ImageVector
                .Builder(
                    name = "Fill.ArrowDownLeftFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(197.66f, 69.66f)
                        lineTo(127.31f, 140f)
                        lineToRelative(46.35f, 46.34f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 200f)
                        horizontalLineTo(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                        lineTo(116f, 128.69f)
                        lineToRelative(70.34f, -70.35f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                        close()
                    }
                }.build()

        return _ArrowDownLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownLeftFill: ImageVector? = null
