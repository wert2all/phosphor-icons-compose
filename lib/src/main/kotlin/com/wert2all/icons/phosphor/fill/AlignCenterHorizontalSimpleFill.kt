package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.AlignCenterHorizontalSimpleFill: ImageVector
    get() {
        if (_AlignCenterHorizontalSimpleFill != null) {
            return _AlignCenterHorizontalSimpleFill!!
        }
        _AlignCenterHorizontalSimpleFill =
            ImageVector
                .Builder(
                    name = "Fill.AlignCenterHorizontalSimpleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(224f, 96f)
                        verticalLineToRelative(64f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        horizontalLineTo(136f)
                        verticalLineToRelative(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(176f)
                        horizontalLineTo(48f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        verticalLineTo(96f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 80f)
                        horizontalLineToRelative(72f)
                        verticalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        verticalLineTo(80f)
                        horizontalLineToRelative(72f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 96f)
                        close()
                    }
                }.build()

        return _AlignCenterHorizontalSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _AlignCenterHorizontalSimpleFill: ImageVector? = null
