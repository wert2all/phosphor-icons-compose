package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.MapPinSimpleLineFill: ImageVector
    get() {
        if (_MapPinSimpleLineFill != null) {
            return _MapPinSimpleLineFill!!
        }
        _MapPinSimpleLineFill =
            ImageVector
                .Builder(
                    name = "MapPinSimpleLineFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(224f, 216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(80f)
                        verticalLineTo(135.42f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        verticalLineTo(208f)
                        horizontalLineToRelative(80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 216f)
                        close()
                    }
                }.build()

        return _MapPinSimpleLineFill!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinSimpleLineFill: ImageVector? = null
