package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.DropSimpleFill: ImageVector
    get() {
        if (_DropSimpleFill != null) {
            return _DropSimpleFill!!
        }
        _DropSimpleFill =
            ImageVector
                .Builder(
                    name = "DropSimpleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(174f, 47.75f)
                        arcToRelative(
                            254.19f,
                            254.19f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = false,
                            -41.45f,
                            -38.3f,
                        )
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.18f, 0f)
                        arcTo(254.19f, 254.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 82f, 47.75f)
                        curveTo(54.51f, 79.32f, 40f, 112.6f, 40f, 144f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 0f)
                        curveTo(216f, 112.6f, 201.49f, 79.32f, 174f, 47.75f)
                        close()
                    }
                }.build()

        return _DropSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _DropSimpleFill: ImageVector? = null
