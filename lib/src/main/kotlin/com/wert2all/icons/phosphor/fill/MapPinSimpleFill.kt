package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.MapPinSimpleFill: ImageVector
    get() {
        if (_MapPinSimpleFill != null) {
            return _MapPinSimpleFill!!
        }
        _MapPinSimpleFill =
            ImageVector
                .Builder(
                    name = "Fill.MapPinSimpleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(136f, 127.42f)
                        verticalLineTo(232f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(127.42f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        close()
                    }
                }.build()

        return _MapPinSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinSimpleFill: ImageVector? = null
