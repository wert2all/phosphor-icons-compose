package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.SubtractSquareFill: ImageVector
    get() {
        if (_SubtractSquareFill != null) {
            return _SubtractSquareFill!!
        }
        _SubtractSquareFill =
            ImageVector
                .Builder(
                    name = "Fill.SubtractSquareFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(216f, 88f)
                        horizontalLineTo(168f)
                        verticalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineTo(160f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineTo(88f)
                        verticalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineTo(216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        verticalLineTo(96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 88f)
                        close()
                        moveTo(48f, 48f)
                        horizontalLineTo(152f)
                        verticalLineTo(152f)
                        horizontalLineTo(48f)
                        close()
                    }
                }.build()

        return _SubtractSquareFill!!
    }

@Suppress("ObjectPropertyName")
private var _SubtractSquareFill: ImageVector? = null
