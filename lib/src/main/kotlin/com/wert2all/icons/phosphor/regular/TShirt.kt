package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.TShirt: ImageVector
    get() {
        if (_TShirt != null) {
            return _TShirt!!
        }
        _TShirt =
            ImageVector
                .Builder(
                    name = "TShirt",
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
                        moveTo(192f, 120f)
                        horizontalLineToRelative(28.34f)
                        arcToRelative(8.44f, 8.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, -4.42f)
                        lineToRelative(19.27f, -36.81f)
                        arcToRelative(7.81f, 7.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.33f, -10.52f)
                        lineTo(192f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 120f)
                        horizontalLineTo(35.66f)
                        arcToRelative(8.44f, 8.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.5f, -4.42f)
                        lineTo(8.89f, 78.77f)
                        arcToRelative(7.81f, 7.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.33f, -10.52f)
                        lineTo(64f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 40f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                        horizontalLineTo(64f)
                        verticalLineTo(208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineTo(184f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        verticalLineTo(40f)
                        close()
                    }
                }.build()

        return _TShirt!!
    }

@Suppress("ObjectPropertyName")
private var _TShirt: ImageVector? = null
