package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ArrowDownRightFill: ImageVector
    get() {
        if (_ArrowDownRightFill != null) {
            return _ArrowDownRightFill!!
        }
        _ArrowDownRightFill =
            ImageVector
                .Builder(
                    name = "Fill.ArrowDownRightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(200f, 88f)
                        verticalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                        lineTo(128.69f, 140f)
                        lineTo(58.34f, 69.66f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69.66f, 58.34f)
                        lineTo(140f, 128.69f)
                        lineToRelative(46.34f, -46.35f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 88f)
                        close()
                    }
                }.build()

        return _ArrowDownRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRightFill: ImageVector? = null
