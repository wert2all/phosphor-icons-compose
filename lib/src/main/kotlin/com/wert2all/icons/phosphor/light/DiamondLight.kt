package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.DiamondLight: ImageVector
    get() {
        if (_DiamondLight != null) {
            return _DiamondLight!!
        }
        _DiamondLight =
            ImageVector
                .Builder(
                    name = "DiamondLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(26.32f, 122.38f)
                        lineTo(122.37f, 26.33f)
                        arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 133.61f, 26.33f)
                        lineTo(229.66f, 122.38f)
                        arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 229.66f, 133.62f)
                        lineTo(133.61f, 229.67f)
                        arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 122.37f, 229.67f)
                        lineTo(26.32f, 133.62f)
                        arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26.32f, 122.38f)
                        close()
                    }
                }.build()

        return _DiamondLight!!
    }

@Suppress("ObjectPropertyName")
private var _DiamondLight: ImageVector? = null
