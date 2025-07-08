package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.WindBold: ImageVector
    get() {
        if (_WindBold != null) {
            return _WindBold!!
        }
        _WindBold =
            ImageVector
                .Builder(
                    name = "Bold.WindBold",
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
                        moveTo(101.22f, 52f)
                        arcTo(27.1f, 27.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 44f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                        horizontalLineTo(24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(189.22f, 88f)
                        arcTo(27.1f, 27.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 80f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                        horizontalLineTo(32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(133.22f, 204f)
                        arcTo(27.1f, 27.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 212f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -48f)
                        horizontalLineTo(40f)
                    }
                }.build()

        return _WindBold!!
    }

@Suppress("ObjectPropertyName")
private var _WindBold: ImageVector? = null
