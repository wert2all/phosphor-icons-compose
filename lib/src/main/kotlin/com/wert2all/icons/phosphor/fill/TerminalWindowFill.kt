package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.TerminalWindowFill: ImageVector
    get() {
        if (_TerminalWindowFill != null) {
            return _TerminalWindowFill!!
        }
        _TerminalWindowFill =
            ImageVector
                .Builder(
                    name = "TerminalWindowFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(216f, 40f)
                        lineTo(40f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                        lineTo(24f, 200f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(216f, 216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(232f, 56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                        close()
                        moveTo(125f, 134.25f)
                        lineTo(85f, 166.25f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10f, -12.5f)
                        lineTo(107.19f, 128f)
                        lineTo(75f, 102.25f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, -12.5f)
                        lineToRelative(40f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12.5f)
                        close()
                        moveTo(176f, 168f)
                        lineTo(136f, 168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        close()
                    }
                }.build()

        return _TerminalWindowFill!!
    }

@Suppress("ObjectPropertyName")
private var _TerminalWindowFill: ImageVector? = null
