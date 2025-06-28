package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.NumberTwoThin: ImageVector
    get() {
        if (_NumberTwoThin != null) {
            return _NumberTwoThin!!
        }
        _NumberTwoThin =
            ImageVector
                .Builder(
                    name = "NumberTwoThin",
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
                        moveTo(91.33f, 72f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68.61f, 40.07f)
                        lineTo(88f, 208f)
                        horizontalLineToRelative(80f)
                    }
                }.build()

        return _NumberTwoThin!!
    }

@Suppress("ObjectPropertyName")
private var _NumberTwoThin: ImageVector? = null
