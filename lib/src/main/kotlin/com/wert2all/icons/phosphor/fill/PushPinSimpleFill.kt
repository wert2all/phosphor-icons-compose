package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.PushPinSimpleFill: ImageVector
    get() {
        if (_PushPinSimpleFill != null) {
            return _PushPinSimpleFill!!
        }
        _PushPinSimpleFill =
            ImageVector
                .Builder(
                    name = "PushPinSimpleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(224f, 176f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(136f)
                        verticalLineToRelative(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(184f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(9.29f)
                        lineTo(70.46f, 48f)
                        horizontalLineTo(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        horizontalLineToRelative(-6.46f)
                        lineToRelative(21.17f, 120f)
                        horizontalLineTo(216f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 176f)
                        close()
                    }
                }.build()

        return _PushPinSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _PushPinSimpleFill: ImageVector? = null
