package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.BatteryVerticalHighFill: ImageVector
    get() {
        if (_BatteryVerticalHighFill != null) {
            return _BatteryVerticalHighFill!!
        }
        _BatteryVerticalHighFill =
            ImageVector
                .Builder(
                    name = "Fill.BatteryVerticalHighFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(88f, 8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        lineTo(96f, 16f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 8f)
                        close()
                        moveTo(160f, 104f)
                        lineTo(96f, 104f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        lineTo(168f, 112f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 104f)
                        close()
                        moveTo(200f, 56f)
                        lineTo(200f, 224f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                        lineTo(80f, 248f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                        lineTo(56f, 56f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 32f)
                        horizontalLineToRelative(96f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 56f)
                        close()
                        moveTo(184f, 56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        lineTo(80f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        lineTo(72f, 224f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        close()
                    }
                }.build()

        return _BatteryVerticalHighFill!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryVerticalHighFill: ImageVector? = null
