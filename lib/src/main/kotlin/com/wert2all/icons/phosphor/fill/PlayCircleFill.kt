package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.PlayCircleFill: ImageVector
    get() {
        if (_PlayCircleFill != null) {
            return _PlayCircleFill!!
        }
        _PlayCircleFill =
            ImageVector
                .Builder(
                    name = "PlayCircleFill",
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
                        moveTo(168.55f, 134.58f)
                        lineTo(116.55f, 170.58f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 164f)
                        lineTo(104f, 92f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.55f, -6.58f)
                        lineToRelative(52f, 36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 13.16f)
                        close()
                    }
                }.build()

        return _PlayCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _PlayCircleFill: ImageVector? = null
