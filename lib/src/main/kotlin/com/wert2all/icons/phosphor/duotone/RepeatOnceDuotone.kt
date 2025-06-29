package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.RepeatOnceDuotone: ImageVector
    get() {
        if (_RepeatOnceDuotone != null) {
            return _RepeatOnceDuotone!!
        }
        _RepeatOnceDuotone =
            ImageVector
                .Builder(
                    name = "RepeatOnceDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(32f, 128f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 64f)
                        horizontalLineTo(224f)
                        verticalLineToRelative(64f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 64f)
                        horizontalLineTo(32f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 88f)
                        lineToRelative(24f, -24f)
                        lineToRelative(-24f, -24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 128f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 64f)
                        horizontalLineTo(224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 168f)
                        lineToRelative(-24f, 24f)
                        lineToRelative(24f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 128f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 64f)
                        horizontalLineTo(32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(120f, 111.99f)
                        lineToRelative(16f, -7.99f)
                        lineToRelative(0f, 48f)
                    }
                }.build()

        return _RepeatOnceDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatOnceDuotone: ImageVector? = null
