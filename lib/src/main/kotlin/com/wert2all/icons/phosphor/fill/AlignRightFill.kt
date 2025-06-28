package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.AlignRightFill: ImageVector
    get() {
        if (_AlignRightFill != null) {
            return _AlignRightFill!!
        }
        _AlignRightFill =
            ImageVector
                .Builder(
                    name = "AlignRightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(224f, 40f)
                        lineTo(224f, 216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        lineTo(208f, 40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                        moveTo(176f, 48f)
                        lineTo(80f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
                        verticalLineToRelative(40f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineToRelative(96f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(192f, 64f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 48f)
                        close()
                        moveTo(176f, 136f)
                        lineTo(40f, 136f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                        verticalLineToRelative(40f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(176f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(192f, 152f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 136f)
                        close()
                    }
                }.build()

        return _AlignRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _AlignRightFill: ImageVector? = null
