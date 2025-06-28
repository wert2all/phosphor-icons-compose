package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon =
            ImageVector
                .Builder(
                    name = "Moon",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(108.11f, 28.11f)
                        arcTo(96.09f, 96.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.89f, 147.89f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 108.11f, 28.11f)
                        close()
                    }
                }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
