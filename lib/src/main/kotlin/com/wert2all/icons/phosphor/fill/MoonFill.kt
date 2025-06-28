package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.MoonFill: ImageVector
    get() {
        if (_MoonFill != null) {
            return _MoonFill!!
        }
        _MoonFill =
            ImageVector
                .Builder(
                    name = "MoonFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(235.54f, 150.21f)
                        arcToRelative(104.84f, 104.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -37f, 52.91f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 120f)
                        arcTo(103.09f, 103.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52.88f, 57.48f)
                        arcToRelative(104.84f, 104.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52.91f, -37f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 10f)
                        arcToRelative(88.08f, 88.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 109.8f, 109.8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 10f)
                        close()
                    }
                }.build()

        return _MoonFill!!
    }

@Suppress("ObjectPropertyName")
private var _MoonFill: ImageVector? = null
