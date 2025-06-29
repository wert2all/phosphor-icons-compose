package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ShuffleLight: ImageVector
    get() {
        if (_ShuffleLight != null) {
            return _ShuffleLight!!
        }
        _ShuffleLight =
            ImageVector
                .Builder(
                    name = "ShuffleLight",
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
                        moveTo(32f, 72f)
                        horizontalLineTo(55.06f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52.08f, 26.8f)
                        lineToRelative(41.72f, 58.4f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200.94f, 184f)
                        horizontalLineTo(232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 48f)
                        lineToRelative(24f, 24f)
                        lineToRelative(-24f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 160f)
                        lineToRelative(24f, 24f)
                        lineToRelative(-24f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(147.66f, 100.47f)
                        lineToRelative(1.2f, -1.67f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200.94f, 72f)
                        horizontalLineTo(232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 184f)
                        horizontalLineTo(55.06f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52.08f, -26.8f)
                        lineToRelative(1.2f, -1.67f)
                    }
                }.build()

        return _ShuffleLight!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleLight: ImageVector? = null
