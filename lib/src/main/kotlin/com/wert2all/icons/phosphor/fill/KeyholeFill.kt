package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.KeyholeFill: ImageVector
    get() {
        if (_KeyholeFill != null) {
            return _KeyholeFill!!
        }
        _KeyholeFill =
            ImageVector
                .Builder(
                    name = "Fill.KeyholeFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(157.52f, 170.39f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.66f, 5.61f)
                        lineTo(102.14f, 176f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.66f, -5.61f)
                        lineTo(112f, 139.72f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        close()
                    }
                }.build()

        return _KeyholeFill!!
    }

@Suppress("ObjectPropertyName")
private var _KeyholeFill: ImageVector? = null
