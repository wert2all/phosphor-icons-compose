package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.DotOutlineFill: ImageVector
    get() {
        if (_DotOutlineFill != null) {
            return _DotOutlineFill!!
        }
        _DotOutlineFill =
            ImageVector
                .Builder(
                    name = "Fill.DotOutlineFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(156f, 128f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, -28f)
                        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 128f)
                        close()
                    }
                }.build()

        return _DotOutlineFill!!
    }

@Suppress("ObjectPropertyName")
private var _DotOutlineFill: ImageVector? = null
