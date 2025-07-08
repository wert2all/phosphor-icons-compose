package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.FlashlightFill: ImageVector
    get() {
        if (_FlashlightFill != null) {
            return _FlashlightFill!!
        }
        _FlashlightFill =
            ImageVector
                .Builder(
                    name = "Fill.FlashlightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(184f, 16f)
                        horizontalLineTo(72f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 32f)
                        verticalLineTo(77.33f)
                        arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.2f, 9.6f)
                        lineTo(80f, 114.67f)
                        verticalLineTo(224f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineToRelative(64f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        verticalLineTo(114.67f)
                        lineToRelative(20.8f, -27.74f)
                        arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.2f, -9.6f)
                        verticalLineTo(32f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 16f)
                        close()
                        moveTo(136f, 152f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                        moveTo(72f, 56f)
                        verticalLineTo(32f)
                        horizontalLineTo(184f)
                        verticalLineTo(56f)
                        close()
                    }
                }.build()

        return _FlashlightFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlashlightFill: ImageVector? = null
