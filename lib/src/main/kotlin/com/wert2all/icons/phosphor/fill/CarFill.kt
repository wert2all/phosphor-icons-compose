package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CarFill: ImageVector
    get() {
        if (_CarFill != null) {
            return _CarFill!!
        }
        _CarFill =
            ImageVector
                .Builder(
                    name = "CarFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(240f, 104f)
                        lineTo(229.2f, 104f)
                        lineTo(201.42f, 41.5f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 186.8f, 32f)
                        lineTo(69.2f, 32f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.62f, 9.5f)
                        lineTo(26.8f, 104f)
                        lineTo(16f, 104f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(80f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(64f, 216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        verticalLineToRelative(-8f)
                        horizontalLineToRelative(96f)
                        verticalLineToRelative(8f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineToRelative(24f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(232f, 120f)
                        horizontalLineToRelative(8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                        close()
                        moveTo(80f, 152f)
                        lineTo(56f, 152f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        lineTo(80f, 136f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        close()
                        moveTo(200f, 152f)
                        lineTo(176f, 152f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        close()
                        moveTo(44.31f, 104f)
                        lineTo(69.2f, 48f)
                        lineTo(186.8f, 48f)
                        lineToRelative(24.89f, 56f)
                        close()
                    }
                }.build()

        return _CarFill!!
    }

@Suppress("ObjectPropertyName")
private var _CarFill: ImageVector? = null
