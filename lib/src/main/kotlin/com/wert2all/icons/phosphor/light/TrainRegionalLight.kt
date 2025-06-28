package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.TrainRegionalLight: ImageVector
    get() {
        if (_TrainRegionalLight != null) {
            return _TrainRegionalLight!!
        }
        _TrainRegionalLight =
            ImageVector
                .Builder(
                    name = "TrainRegionalLight",
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
                        moveTo(70.11f, 32f)
                        horizontalLineTo(185.89f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.72f, 5.9f)
                        lineTo(216f, 120f)
                        lineToRelative(-22.39f, 82.1f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.72f, 5.9f)
                        horizontalLineTo(70.11f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.72f, -5.9f)
                        lineTo(40f, 120f)
                        lineTo(62.39f, 37.9f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 70.11f, 32f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 208f)
                        lineTo(128f, 136f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 120f)
                        lineToRelative(88f, 16f)
                        lineToRelative(88f, -16f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 88f)
                        lineTo(160f, 88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 208f)
                        lineTo(72f, 240f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 208f)
                        lineTo(184f, 240f)
                    }
                }.build()

        return _TrainRegionalLight!!
    }

@Suppress("ObjectPropertyName")
private var _TrainRegionalLight: ImageVector? = null
