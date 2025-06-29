package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.CloudSunBold: ImageVector
    get() {
        if (_CloudSunBold != null) {
            return _CloudSunBold!!
        }
        _CloudSunBold =
            ImageVector
                .Builder(
                    name = "CloudSunBold",
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
                        moveTo(87.66f, 56.73f)
                        lineTo(83.5f, 33.09f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56.69f, 76.46f)
                        lineTo(37.03f, 62.69f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48.73f, 112.31f)
                        lineTo(25.09f, 116.48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(123.52f, 64.69f)
                        lineTo(137.28f, 45.03f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 144f)
                        arcToRelative(68.06f, 68.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68f, 72f)
                        horizontalLineTo(84f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.2f, -85.66f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(59.65f, 135.35f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80.19f, -50.94f)
                    }
                }.build()

        return _CloudSunBold!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSunBold: ImageVector? = null
