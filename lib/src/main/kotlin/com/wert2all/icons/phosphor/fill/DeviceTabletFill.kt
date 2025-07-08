package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.DeviceTabletFill: ImageVector
    get() {
        if (_DeviceTabletFill != null) {
            return _DeviceTabletFill!!
        }
        _DeviceTabletFill =
            ImageVector
                .Builder(
                    name = "Fill.DeviceTabletFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(192f, 24f)
                        horizontalLineTo(64f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 48f)
                        verticalLineTo(208f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                        horizontalLineTo(192f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                        verticalLineTo(48f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 24f)
                        close()
                        moveTo(64f, 40f)
                        horizontalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineToRelative(8f)
                        horizontalLineTo(56f)
                        verticalLineTo(48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 40f)
                        close()
                        moveTo(192f, 216f)
                        horizontalLineTo(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineToRelative(-8f)
                        horizontalLineTo(200f)
                        verticalLineToRelative(8f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 216f)
                        close()
                    }
                }.build()

        return _DeviceTabletFill!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceTabletFill: ImageVector? = null
