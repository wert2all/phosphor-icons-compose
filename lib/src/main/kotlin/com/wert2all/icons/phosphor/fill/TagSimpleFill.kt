package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.TagSimpleFill: ImageVector
    get() {
        if (_TagSimpleFill != null) {
            return _TagSimpleFill!!
        }
        _TagSimpleFill =
            ImageVector
                .Builder(
                    name = "TagSimpleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(246.66f, 123.56f)
                        lineTo(201f, 55.13f)
                        arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.72f, 48f)
                        horizontalLineTo(40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                        verticalLineTo(192f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineTo(187.72f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 201f, 200.88f)
                        horizontalLineToRelative(0f)
                        lineToRelative(45.63f, -68.44f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 246.66f, 123.56f)
                        close()
                    }
                }.build()

        return _TagSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _TagSimpleFill: ImageVector? = null
