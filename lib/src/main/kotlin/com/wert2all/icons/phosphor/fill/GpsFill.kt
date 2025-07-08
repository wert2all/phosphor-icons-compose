package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.GpsFill: ImageVector
    get() {
        if (_GpsFill != null) {
            return _GpsFill!!
        }
        _GpsFill =
            ImageVector
                .Builder(
                    name = "Fill.GpsFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(248f, 128f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(215.63f)
                        arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 215.63f)
                        verticalLineTo(240f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(215.63f)
                        arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.37f, 136f)
                        horizontalLineTo(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineTo(40.37f)
                        arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 40.37f)
                        verticalLineTo(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        verticalLineTo(40.37f)
                        arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215.63f, 120f)
                        horizontalLineTo(240f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 128f)
                        close()
                    }
                }.build()

        return _GpsFill!!
    }

@Suppress("ObjectPropertyName")
private var _GpsFill: ImageVector? = null
