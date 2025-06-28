package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.SubsetProperOfLight: ImageVector
    get() {
        if (_SubsetProperOfLight != null) {
            return _SubsetProperOfLight!!
        }
        _SubsetProperOfLight =
            ImageVector
                .Builder(
                    name = "SubsetProperOfLight",
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
                        moveTo(200f, 48f)
                        horizontalLineTo(128f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 80f)
                        horizontalLineToRelative(0f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 80f)
                        horizontalLineToRelative(72f)
                    }
                }.build()

        return _SubsetProperOfLight!!
    }

@Suppress("ObjectPropertyName")
private var _SubsetProperOfLight: ImageVector? = null
