package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.SubtractFill: ImageVector
    get() {
        if (_SubtractFill != null) {
            return _SubtractFill!!
        }
        _SubtractFill =
            ImageVector
                .Builder(
                    name = "Fill.SubtractFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(174.63f, 81.35f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, -93.28f, 93.28f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 93.28f, -93.28f)
                        close()
                        moveTo(96f, 160f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, -64f)
                        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 160f)
                        close()
                    }
                }.build()

        return _SubtractFill!!
    }

@Suppress("ObjectPropertyName")
private var _SubtractFill: ImageVector? = null
