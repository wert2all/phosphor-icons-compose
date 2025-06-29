package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.CircleNotchBold: ImageVector
    get() {
        if (_CircleNotchBold != null) {
            return _CircleNotchBold!!
        }
        _CircleNotchBold =
            ImageVector
                .Builder(
                    name = "CircleNotchBold",
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
                        moveTo(168f, 40f)
                        arcToRelative(97f, 97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 88f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -192f, 0f)
                        arcTo(97f, 97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 40f)
                    }
                }.build()

        return _CircleNotchBold!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNotchBold: ImageVector? = null
