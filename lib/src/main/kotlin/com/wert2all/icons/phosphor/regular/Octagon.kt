package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Octagon: ImageVector
    get() {
        if (_Octagon != null) {
            return _Octagon!!
        }
        _Octagon =
            ImageVector
                .Builder(
                    name = "Regular.Octagon",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                    ) {
                        moveTo(164.45f, 32f)
                        horizontalLineTo(91.55f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 2.34f)
                        lineTo(34.34f, 85.89f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 91.55f)
                        verticalLineToRelative(72.9f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, 5.66f)
                        lineToRelative(51.55f, 51.55f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.55f, 224f)
                        horizontalLineToRelative(72.9f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -2.34f)
                        lineToRelative(51.55f, -51.55f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, -5.66f)
                        verticalLineTo(91.55f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                        lineTo(170.11f, 34.34f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164.45f, 32f)
                        close()
                    }
                }.build()

        return _Octagon!!
    }

@Suppress("ObjectPropertyName")
private var _Octagon: ImageVector? = null
