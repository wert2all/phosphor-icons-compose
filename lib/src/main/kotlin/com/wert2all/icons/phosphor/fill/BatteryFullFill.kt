package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.BatteryFullFill: ImageVector
    get() {
        if (_BatteryFullFill != null) {
            return _BatteryFullFill!!
        }
        _BatteryFullFill =
            ImageVector
                .Builder(
                    name = "BatteryFullFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(200f, 56f)
                        lineTo(32f, 56f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 80f)
                        verticalLineToRelative(96f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                        lineTo(200f, 200f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                        lineTo(224f, 80f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 56f)
                        close()
                        moveTo(208f, 176f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        lineTo(32f, 184f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        lineTo(24f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        lineTo(200f, 72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        close()
                        moveTo(192f, 96f)
                        verticalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        lineTo(48f, 168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        lineTo(40f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        lineTo(184f, 88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 96f)
                        close()
                        moveTo(256f, 96f)
                        verticalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        lineTo(240f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                    }
                }.build()

        return _BatteryFullFill!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryFullFill: ImageVector? = null
