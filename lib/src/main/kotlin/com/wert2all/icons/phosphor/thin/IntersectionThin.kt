package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.IntersectionThin: ImageVector
    get() {
        if (_IntersectionThin != null) {
            return _IntersectionThin!!
        }
        _IntersectionThin =
            ImageVector
                .Builder(
                    name = "IntersectionThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 200f)
                        verticalLineTo(120f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 0f)
                        verticalLineToRelative(80f)
                    }
                }.build()

        return _IntersectionThin!!
    }

@Suppress("ObjectPropertyName")
private var _IntersectionThin: ImageVector? = null
