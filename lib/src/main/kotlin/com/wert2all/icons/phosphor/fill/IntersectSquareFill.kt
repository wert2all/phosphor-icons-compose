package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.IntersectSquareFill: ImageVector
    get() {
        if (_IntersectSquareFill != null) {
            return _IntersectSquareFill!!
        }
        _IntersectSquareFill =
            ImageVector
                .Builder(
                    name = "IntersectSquareFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(216f, 88f)
                        lineTo(168f, 88f)
                        lineTo(168f, 40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        lineTo(40f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        lineTo(32f, 160f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        lineTo(88f, 168f)
                        verticalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        lineTo(216f, 224f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        lineTo(224f, 96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 88f)
                        close()
                        moveTo(48f, 152f)
                        lineTo(48f, 48f)
                        lineTo(152f, 48f)
                        lineTo(152f, 88f)
                        lineTo(96f, 88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(56f)
                        close()
                        moveTo(208f, 208f)
                        lineTo(104f, 208f)
                        lineTo(104f, 168f)
                        horizontalLineToRelative(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        lineTo(168f, 104f)
                        horizontalLineToRelative(40f)
                        close()
                    }
                }.build()

        return _IntersectSquareFill!!
    }

@Suppress("ObjectPropertyName")
private var _IntersectSquareFill: ImageVector? = null
