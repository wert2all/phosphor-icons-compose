package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ClipboardFill: ImageVector
    get() {
        if (_ClipboardFill != null) {
            return _ClipboardFill!!
        }
        _ClipboardFill =
            ImageVector
                .Builder(
                    name = "Fill.ClipboardFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(200f, 32f)
                        lineTo(163.74f, 32f)
                        arcToRelative(47.92f, 47.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -71.48f, 0f)
                        lineTo(56f, 32f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 48f)
                        lineTo(40f, 216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(200f, 232f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(216f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 32f)
                        close()
                        moveTo(128f, 32f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                        lineTo(96f, 64f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 32f)
                        close()
                    }
                }.build()

        return _ClipboardFill!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardFill: ImageVector? = null
