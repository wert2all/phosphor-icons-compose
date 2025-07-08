package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.VectorTwoFill: ImageVector
    get() {
        if (_VectorTwoFill != null) {
            return _VectorTwoFill!!
        }
        _VectorTwoFill =
            ImageVector
                .Builder(
                    name = "Fill.VectorTwoFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(229.66f, 197.66f)
                        lineToRelative(-32f, 32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 224f)
                        verticalLineTo(200f)
                        horizontalLineTo(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(80f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                        lineToRelative(32f, -32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                        lineToRelative(32f, 32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 80f)
                        horizontalLineTo(88f)
                        verticalLineTo(184f)
                        horizontalLineToRelative(96f)
                        verticalLineTo(160f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                        lineToRelative(32f, 32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 229.66f, 197.66f)
                        close()
                    }
                }.build()

        return _VectorTwoFill!!
    }

@Suppress("ObjectPropertyName")
private var _VectorTwoFill: ImageVector? = null
