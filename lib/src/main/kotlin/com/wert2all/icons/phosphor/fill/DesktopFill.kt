package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.DesktopFill: ImageVector
    get() {
        if (_DesktopFill != null) {
            return _DesktopFill!!
        }
        _DesktopFill =
            ImageVector
                .Builder(
                    name = "Fill.DesktopFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(208f, 40f)
                        lineTo(48f, 40f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                        lineTo(24f, 176f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                        horizontalLineToRelative(72f)
                        verticalLineToRelative(16f)
                        lineTo(96f, 216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                        lineTo(136f, 216f)
                        lineTo(136f, 200f)
                        horizontalLineToRelative(72f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                        lineTo(232f, 64f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 40f)
                        close()
                        moveTo(208f, 184f)
                        lineTo(48f, 184f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        lineTo(40f, 160f)
                        lineTo(216f, 160f)
                        verticalLineToRelative(16f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 184f)
                        close()
                    }
                }.build()

        return _DesktopFill!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopFill: ImageVector? = null
