package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.RugFill: ImageVector
    get() {
        if (_RugFill != null) {
            return _RugFill!!
        }
        _RugFill =
            ImageVector
                .Builder(
                    name = "Fill.RugFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(200f, 16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineTo(40f)
                        horizontalLineTo(160f)
                        verticalLineTo(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                        verticalLineTo(40f)
                        horizontalLineTo(112f)
                        verticalLineTo(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                        verticalLineTo(40f)
                        horizontalLineTo(64f)
                        verticalLineTo(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                        verticalLineTo(232f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(216f)
                        horizontalLineTo(96f)
                        verticalLineToRelative(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(216f)
                        horizontalLineToRelative(32f)
                        verticalLineToRelative(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(216f)
                        horizontalLineToRelative(32f)
                        verticalLineToRelative(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(24f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 16f)
                        close()
                        moveTo(155.43f, 130.06f)
                        lineToRelative(-24f, 40f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.86f, 0f)
                        lineToRelative(-24f, -40f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.12f)
                        lineToRelative(24f, -40f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.86f, 0f)
                        lineToRelative(24f, 40f)
                        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 155.43f, 130.06f)
                        close()
                    }
                }.build()

        return _RugFill!!
    }

@Suppress("ObjectPropertyName")
private var _RugFill: ImageVector? = null
