package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.BatteryVerticalFullFill: ImageVector
    get() {
        if (_BatteryVerticalFullFill != null) {
            return _BatteryVerticalFullFill!!
        }
        _BatteryVerticalFullFill =
            ImageVector
                .Builder(
                    name = "BatteryVerticalFullFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(88f, 8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        lineTo(96f, 16f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 8f)
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
                        moveTo(160f, 64f)
                        lineTo(96f, 64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        lineTo(88f, 208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        lineTo(168f, 72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 64f)
                        close()
                    }
                }.build()

        return _BatteryVerticalFullFill!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryVerticalFullFill: ImageVector? = null
