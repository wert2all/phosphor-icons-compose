package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.FlaskLight: ImageVector
    get() {
        if (_FlaskLight != null) {
            return _FlaskLight!!
        }
        _FlaskLight =
            ImageVector
                .Builder(
                    name = "FlaskLight",
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
                        moveTo(88f, 32f)
                        lineTo(168f, 32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 32f)
                        verticalLineTo(99.14f)
                        lineToRelative(62.85f, 104.74f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 216f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.86f, -12.12f)
                        lineTo(104f, 99.14f)
                        verticalLineTo(32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(71.63f, 153.08f)
                        curveToRelative(13.23f, -2.48f, 32f, -1.41f, 56.37f, 10.92f)
                        curveToRelative(32.25f, 16.33f, 54.75f, 12.91f, 67.5f, 7.65f)
                    }
                }.build()

        return _FlaskLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskLight: ImageVector? = null
