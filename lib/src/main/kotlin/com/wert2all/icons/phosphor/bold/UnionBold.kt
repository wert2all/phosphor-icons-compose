package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.UnionBold: ImageVector
    get() {
        if (_UnionBold != null) {
            return _UnionBold!!
        }
        _UnionBold =
            ImageVector
                .Builder(
                    name = "UnionBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 64f)
                        verticalLineToRelative(80f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -144f, 0f)
                        verticalLineTo(64f)
                    }
                }.build()

        return _UnionBold!!
    }

@Suppress("ObjectPropertyName")
private var _UnionBold: ImageVector? = null
