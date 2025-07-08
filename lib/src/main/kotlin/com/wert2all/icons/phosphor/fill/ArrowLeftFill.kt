package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ArrowLeftFill: ImageVector
    get() {
        if (_ArrowLeftFill != null) {
            return _ArrowLeftFill!!
        }
        _ArrowLeftFill =
            ImageVector
                .Builder(
                    name = "Fill.ArrowLeftFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(224f, 128f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(120f)
                        verticalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                        lineToRelative(-72f, -72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                        lineToRelative(72f, -72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 56f)
                        verticalLineToRelative(64f)
                        horizontalLineToRelative(96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                        close()
                    }
                }.build()

        return _ArrowLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftFill: ImageVector? = null
