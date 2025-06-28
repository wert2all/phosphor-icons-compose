package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.LinkSimpleBreakLight: ImageVector
    get() {
        if (_LinkSimpleBreakLight != null) {
            return _LinkSimpleBreakLight!!
        }
        _LinkSimpleBreakLight =
            ImageVector
                .Builder(
                    name = "LinkSimpleBreakLight",
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
                        moveTo(112f, 76.11f)
                        lineToRelative(30.06f, -30f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 67.88f, 67.88f)
                        lineTo(179.88f, 144f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(76.11f, 112f)
                        lineToRelative(-30f, 30.06f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.88f, 67.88f)
                        lineTo(144f, 179.88f)
                    }
                }.build()

        return _LinkSimpleBreakLight!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSimpleBreakLight: ImageVector? = null
