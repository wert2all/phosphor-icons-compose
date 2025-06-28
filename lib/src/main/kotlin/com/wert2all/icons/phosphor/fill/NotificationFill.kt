package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.NotificationFill: ImageVector
    get() {
        if (_NotificationFill != null) {
            return _NotificationFill!!
        }
        _NotificationFill =
            ImageVector
                .Builder(
                    name = "NotificationFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(216f, 128f)
                        verticalLineToRelative(80f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        horizontalLineTo(48f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        verticalLineTo(56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 40f)
                        horizontalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        horizontalLineTo(48f)
                        verticalLineTo(208f)
                        horizontalLineTo(200f)
                        verticalLineTo(128f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                        moveTo(196f, 24f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 36f, 36f)
                        arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 196f, 24f)
                        close()
                    }
                }.build()

        return _NotificationFill!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationFill: ImageVector? = null
