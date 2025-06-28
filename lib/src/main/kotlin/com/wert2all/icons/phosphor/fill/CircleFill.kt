package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CircleFill: ImageVector
    get() {
        if (_CircleFill != null) {
            return _CircleFill!!
        }
        _CircleFill =
            ImageVector
                .Builder(
                    name = "CircleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 128f)
                        moveToRelative(-104f, 0f)
                        arcToRelative(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 208f, 0f)
                        arcToRelative(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, -208f, 0f)
                    }
                }.build()

        return _CircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _CircleFill: ImageVector? = null
