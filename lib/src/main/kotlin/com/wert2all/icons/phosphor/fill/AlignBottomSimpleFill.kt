package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.AlignBottomSimpleFill: ImageVector
    get() {
        if (_AlignBottomSimpleFill != null) {
            return _AlignBottomSimpleFill!!
        }
        _AlignBottomSimpleFill =
            ImageVector
                .Builder(
                    name = "AlignBottomSimpleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(208f, 232f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineTo(200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 232f)
                        close()
                        moveTo(96f, 208f)
                        horizontalLineToRelative(64f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        verticalLineTo(40f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                        horizontalLineTo(96f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 40f)
                        verticalLineTo(192f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 208f)
                        close()
                    }
                }.build()

        return _AlignBottomSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _AlignBottomSimpleFill: ImageVector? = null
