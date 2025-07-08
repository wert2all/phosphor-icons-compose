package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ParallelogramFill: ImageVector
    get() {
        if (_ParallelogramFill != null) {
            return _ParallelogramFill!!
        }
        _ParallelogramFill =
            ImageVector
                .Builder(
                    name = "Fill.ParallelogramFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(246.58f, 62.57f)
                        lineToRelative(-64.8f, 144f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 167.19f, 216f)
                        horizontalLineTo(24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.42f, 193.43f)
                        lineToRelative(64.8f, -144f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.81f, 40f)
                        horizontalLineTo(232f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.59f, 22.57f)
                        close()
                    }
                }.build()

        return _ParallelogramFill!!
    }

@Suppress("ObjectPropertyName")
private var _ParallelogramFill: ImageVector? = null
