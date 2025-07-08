package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.OctagonFill: ImageVector
    get() {
        if (_OctagonFill != null) {
            return _OctagonFill!!
        }
        _OctagonFill =
            ImageVector
                .Builder(
                    name = "Fill.OctagonFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(227.31f, 80.23f)
                        lineTo(175.77f, 28.69f)
                        arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164.45f, 24f)
                        horizontalLineTo(91.55f)
                        arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 4.69f)
                        lineTo(28.69f, 80.23f)
                        arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 91.55f)
                        verticalLineToRelative(72.9f)
                        arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.69f, 11.32f)
                        lineToRelative(51.54f, 51.54f)
                        arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.55f, 232f)
                        horizontalLineToRelative(72.9f)
                        arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -4.69f)
                        lineToRelative(51.54f, -51.54f)
                        arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 164.45f)
                        verticalLineTo(91.55f)
                        arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.31f, 80.23f)
                        close()
                    }
                }.build()

        return _OctagonFill!!
    }

@Suppress("ObjectPropertyName")
private var _OctagonFill: ImageVector? = null
