package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.AirTrafficControlFill: ImageVector
    get() {
        if (_AirTrafficControlFill != null) {
            return _AirTrafficControlFill!!
        }
        _AirTrafficControlFill =
            ImageVector
                .Builder(
                    name = "AirTrafficControlFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(229.11f, 70.82f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 64f)
                        horizontalLineTo(136f)
                        verticalLineTo(32f)
                        horizontalLineToRelative(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                        horizontalLineTo(104f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(64f)
                        horizontalLineTo(40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25f, 85.47f)
                        lineToRelative(26.19f, 72f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10.53f)
                        horizontalLineTo(189.82f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, -10.53f)
                        lineToRelative(26.19f, -72f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 229.11f, 70.82f)
                        close()
                        moveTo(102.52f, 151.87f)
                        arcToRelative(7.87f, 7.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.44f, 0.13f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.86f, -6.57f)
                        lineTo(83f, 89.43f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.75f, -2.86f)
                        lineToRelative(10.18f, 56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 102.52f, 151.87f)
                        close()
                        moveTo(173f, 89.43f)
                        lineToRelative(-10.19f, 56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.86f, 6.57f)
                        arcToRelative(7.87f, 7.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.44f, -0.13f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.44f, -9.3f)
                        lineToRelative(10.18f, -56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 173f, 89.43f)
                        close()
                        moveTo(160f, 188f)
                        verticalLineToRelative(44f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(104f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(188f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                        horizontalLineToRelative(56f)
                        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 188f)
                        close()
                    }
                }.build()

        return _AirTrafficControlFill!!
    }

@Suppress("ObjectPropertyName")
private var _AirTrafficControlFill: ImageVector? = null
