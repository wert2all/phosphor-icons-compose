package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.MouseScroll: ImageVector
    get() {
        if (_MouseScroll != null) {
            return _MouseScroll!!
        }
        _MouseScroll =
            ImageVector
                .Builder(
                    name = "MouseScroll",
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
                        moveTo(112f, 24f)
                        lineTo(144f, 24f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 80f)
                        lineTo(200f, 176f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 232f)
                        lineTo(112f, 232f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 176f)
                        lineTo(56f, 80f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 24f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 88f)
                        lineToRelative(-24f, -24f)
                        lineToRelative(-24f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 168f)
                        lineToRelative(-24f, 24f)
                        lineToRelative(-24f, -24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 64f)
                        lineTo(128f, 192f)
                    }
                }.build()

        return _MouseScroll!!
    }

@Suppress("ObjectPropertyName")
private var _MouseScroll: ImageVector? = null
