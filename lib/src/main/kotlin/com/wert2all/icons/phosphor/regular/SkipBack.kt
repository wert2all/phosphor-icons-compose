package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.SkipBack: ImageVector
    get() {
        if (_SkipBack != null) {
            return _SkipBack!!
        }
        _SkipBack =
            ImageVector
                .Builder(
                    name = "SkipBack",
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
                        moveTo(56f, 40f)
                        lineTo(56f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 47.88f)
                        verticalLineTo(208.12f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.19f, 6.65f)
                        lineTo(59.7f, 134.65f)
                        arcToRelative(7.83f, 7.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -13.3f)
                        lineTo(187.81f, 41.23f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 47.88f)
                        close()
                    }
                }.build()

        return _SkipBack!!
    }

@Suppress("ObjectPropertyName")
private var _SkipBack: ImageVector? = null
