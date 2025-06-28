package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.HouseSimpleFill: ImageVector
    get() {
        if (_HouseSimpleFill != null) {
            return _HouseSimpleFill!!
        }
        _HouseSimpleFill =
            ImageVector
                .Builder(
                    name = "HouseSimpleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(224f, 120f)
                        verticalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(120f)
                        arcToRelative(15.87f, 15.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.69f, -11.32f)
                        lineToRelative(80f, -80f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 0f)
                        lineToRelative(80f, 80f)
                        arcTo(15.87f, 15.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 120f)
                        close()
                    }
                }.build()

        return _HouseSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _HouseSimpleFill: ImageVector? = null
