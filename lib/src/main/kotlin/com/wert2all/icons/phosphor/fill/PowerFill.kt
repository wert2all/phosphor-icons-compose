package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.PowerFill: ImageVector
    get() {
        if (_PowerFill != null) {
            return _PowerFill!!
        }
        _PowerFill =
            ImageVector
                .Builder(
                    name = "Fill.PowerFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(120f, 64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        verticalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        close()
                        moveTo(128f, 208f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 83.55f, 61.48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.9f, 13.29f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 71.1f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.9f, -13.29f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 208f)
                        close()
                    }
                }.build()

        return _PowerFill!!
    }

@Suppress("ObjectPropertyName")
private var _PowerFill: ImageVector? = null
