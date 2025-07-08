package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.MedalFill: ImageVector
    get() {
        if (_MedalFill != null) {
            return _MedalFill!!
        }
        _MedalFill =
            ImageVector
                .Builder(
                    name = "Fill.MedalFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(216f, 96f)
                        arcTo(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 72f, 163.83f)
                        lineTo(72f, 240f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.58f, 7.16f)
                        lineTo(128f, 225f)
                        lineToRelative(44.43f, 22.21f)
                        arcTo(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 248f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        lineTo(184f, 163.83f)
                        arcTo(87.85f, 87.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 96f)
                        close()
                        moveTo(56f, 96f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 72f)
                        arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 96f)
                        close()
                        moveTo(72f, 96f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, 56f)
                        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 96f)
                        close()
                    }
                }.build()

        return _MedalFill!!
    }

@Suppress("ObjectPropertyName")
private var _MedalFill: ImageVector? = null
