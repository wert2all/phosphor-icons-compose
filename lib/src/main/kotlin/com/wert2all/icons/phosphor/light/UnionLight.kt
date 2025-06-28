package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.UnionLight: ImageVector
    get() {
        if (_UnionLight != null) {
            return _UnionLight!!
        }
        _UnionLight =
            ImageVector
                .Builder(
                    name = "UnionLight",
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
                        moveTo(200f, 64f)
                        verticalLineToRelative(80f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -144f, 0f)
                        verticalLineTo(64f)
                    }
                }.build()

        return _UnionLight!!
    }

@Suppress("ObjectPropertyName")
private var _UnionLight: ImageVector? = null
