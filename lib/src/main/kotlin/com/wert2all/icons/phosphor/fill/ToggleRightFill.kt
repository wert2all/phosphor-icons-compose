package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ToggleRightFill: ImageVector
    get() {
        if (_ToggleRightFill != null) {
            return _ToggleRightFill!!
        }
        _ToggleRightFill =
            ImageVector
                .Builder(
                    name = "Fill.ToggleRightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(176f, 56f)
                        lineTo(80f, 56f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 144f)
                        horizontalLineToRelative(96f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -144f)
                        close()
                        moveTo(176f, 168f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 168f)
                        close()
                    }
                }.build()

        return _ToggleRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleRightFill: ImageVector? = null
