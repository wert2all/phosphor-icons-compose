package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ChatCircleDotsFill: ImageVector
    get() {
        if (_ChatCircleDotsFill != null) {
            return _ChatCircleDotsFill!!
        }
        _ChatCircleDotsFill =
            ImageVector
                .Builder(
                    name = "Fill.ChatCircleDotsFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36.18f, 176.88f)
                        lineTo(24.83f, 210.93f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.24f, 20.24f)
                        lineToRelative(34.05f, -11.35f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(84f, 140f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 140f)
                        close()
                        moveTo(128f, 140f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 140f)
                        close()
                        moveTo(172f, 140f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 140f)
                        close()
                    }
                }.build()

        return _ChatCircleDotsFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatCircleDotsFill: ImageVector? = null
