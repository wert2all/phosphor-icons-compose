package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ShieldFill: ImageVector
    get() {
        if (_ShieldFill != null) {
            return _ShieldFill!!
        }
        _ShieldFill =
            ImageVector
                .Builder(
                    name = "Fill.ShieldFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(224f, 56f)
                        verticalLineToRelative(56f)
                        curveToRelative(0f, 52.72f, -25.52f, 84.67f, -46.93f, 102.19f)
                        curveToRelative(-23.06f, 18.86f, -46f, 25.27f, -47f, 25.53f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.2f, 0f)
                        curveToRelative(-1f, -0.26f, -23.91f, -6.67f, -47f, -25.53f)
                        curveTo(57.52f, 196.67f, 32f, 164.72f, 32f, 112f)
                        verticalLineTo(56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 40f)
                        horizontalLineTo(208f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 56f)
                        close()
                    }
                }.build()

        return _ShieldFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldFill: ImageVector? = null
