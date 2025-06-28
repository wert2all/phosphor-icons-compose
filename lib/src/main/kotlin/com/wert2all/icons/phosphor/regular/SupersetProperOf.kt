package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.SupersetProperOf: ImageVector
    get() {
        if (_SupersetProperOf != null) {
            return _SupersetProperOf!!
        }
        _SupersetProperOf =
            ImageVector
                .Builder(
                    name = "SupersetProperOf",
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
                        moveTo(64f, 208f)
                        horizontalLineToRelative(72f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -160f)
                        horizontalLineTo(64f)
                    }
                }.build()

        return _SupersetProperOf!!
    }

@Suppress("ObjectPropertyName")
private var _SupersetProperOf: ImageVector? = null
