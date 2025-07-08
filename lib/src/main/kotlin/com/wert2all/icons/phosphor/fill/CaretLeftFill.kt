package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.CaretLeftFill: ImageVector
    get() {
        if (_CaretLeftFill != null) {
            return _CaretLeftFill!!
        }
        _CaretLeftFill =
            ImageVector
                .Builder(
                    name = "Fill.CaretLeftFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(163.06f, 40.61f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.72f, 1.73f)
                        lineToRelative(-80f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.32f)
                        lineToRelative(80f, 80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 208f)
                        verticalLineTo(48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 163.06f, 40.61f)
                        close()
                    }
                }.build()

        return _CaretLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLeftFill: ImageVector? = null
