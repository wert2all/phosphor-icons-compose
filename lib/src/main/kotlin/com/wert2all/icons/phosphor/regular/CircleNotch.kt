package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.CircleNotch: ImageVector
    get() {
        if (_CircleNotch != null) {
            return _CircleNotch!!
        }
        _CircleNotch =
            ImageVector
                .Builder(
                    name = "Regular.CircleNotch",
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
                        moveTo(168f, 40f)
                        arcToRelative(97f, 97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 88f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -192f, 0f)
                        arcTo(97f, 97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 40f)
                    }
                }.build()

        return _CircleNotch!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNotch: ImageVector? = null
