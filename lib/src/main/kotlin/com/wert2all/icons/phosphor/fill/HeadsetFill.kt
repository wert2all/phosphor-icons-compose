package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.HeadsetFill: ImageVector
    get() {
        if (_HeadsetFill != null) {
            return _HeadsetFill!!
        }
        _HeadsetFill =
            ImageVector
                .Builder(
                    name = "Fill.HeadsetFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(232f, 128f)
                        verticalLineToRelative(80f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, 40f)
                        horizontalLineTo(136f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(56f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                        horizontalLineTo(192f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                        verticalLineTo(144f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
                        horizontalLineToRelative(23.65f)
                        arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 66f, 65.54f)
                        arcTo(87.29f, 87.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.36f, 120f)
                        horizontalLineTo(64f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
                        verticalLineToRelative(40f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                        horizontalLineTo(48f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                        verticalLineTo(128f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 201.89f, 54.66f)
                        arcTo(103.41f, 103.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                        close()
                    }
                }.build()

        return _HeadsetFill!!
    }

@Suppress("ObjectPropertyName")
private var _HeadsetFill: ImageVector? = null
