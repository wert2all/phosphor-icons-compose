package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.SpeakerSimpleLowFill: ImageVector
    get() {
        if (_SpeakerSimpleLowFill != null) {
            return _SpeakerSimpleLowFill!!
        }
        _SpeakerSimpleLowFill =
            ImageVector
                .Builder(
                    name = "Fill.SpeakerSimpleLowFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(168f, 32f)
                        lineTo(168f, 224f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.91f, 6.31f)
                        lineTo(85.25f, 176f)
                        lineTo(40f, 176f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        lineTo(24f, 96f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 80f)
                        lineTo(85.25f, 80f)
                        lineToRelative(69.84f, -54.31f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 32f)
                        close()
                        moveTo(200f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(208f, 104f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 96f)
                        close()
                    }
                }.build()

        return _SpeakerSimpleLowFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerSimpleLowFill: ImageVector? = null
