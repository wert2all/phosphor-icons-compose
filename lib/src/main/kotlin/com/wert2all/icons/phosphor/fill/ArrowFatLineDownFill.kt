package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ArrowFatLineDownFill: ImageVector
    get() {
        if (_ArrowFatLineDownFill != null) {
            return _ArrowFatLineDownFill!!
        }
        _ArrowFatLineDownFill =
            ImageVector
                .Builder(
                    name = "Fill.ArrowFatLineDownFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(229.66f, 141.66f)
                        lineToRelative(-96f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-96f, -96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 128f)
                        horizontalLineTo(72f)
                        verticalLineTo(72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineToRelative(56f)
                        horizontalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                        close()
                        moveTo(184f, 40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        horizontalLineTo(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineToRelative(96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 40f)
                        close()
                    }
                }.build()

        return _ArrowFatLineDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLineDownFill: ImageVector? = null
