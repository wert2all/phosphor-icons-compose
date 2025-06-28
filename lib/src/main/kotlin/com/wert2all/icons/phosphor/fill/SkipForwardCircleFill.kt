package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.SkipForwardCircleFill: ImageVector
    get() {
        if (_SkipForwardCircleFill != null) {
            return _SkipForwardCircleFill!!
        }
        _SkipForwardCircleFill =
            ImageVector
                .Builder(
                    name = "SkipForwardCircleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(168f, 168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        lineTo(152f, 137.83f)
                        lineToRelative(-51.35f, 36.68f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 168f)
                        lineTo(88f, 88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.65f, -6.51f)
                        lineTo(152f, 118.17f)
                        lineTo(152f, 88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                    }
                }.build()

        return _SkipForwardCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _SkipForwardCircleFill: ImageVector? = null
