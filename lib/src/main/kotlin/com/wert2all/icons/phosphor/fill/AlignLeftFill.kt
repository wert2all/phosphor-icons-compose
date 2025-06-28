package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.AlignLeftFill: ImageVector
    get() {
        if (_AlignLeftFill != null) {
            return _AlignLeftFill!!
        }
        _AlignLeftFill =
            ImageVector
                .Builder(
                    name = "AlignLeftFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(232f, 152f)
                        verticalLineToRelative(40f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        lineTo(80f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        lineTo(64f, 152f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                        lineTo(216f, 136f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 152f)
                        close()
                        moveTo(40f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        lineTo(32f, 216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(48f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 32f)
                        close()
                        moveTo(80f, 120f)
                        horizontalLineToRelative(96f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(192f, 64f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                        lineTo(80f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
                        verticalLineToRelative(40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 120f)
                        close()
                    }
                }.build()

        return _AlignLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _AlignLeftFill: ImageVector? = null
