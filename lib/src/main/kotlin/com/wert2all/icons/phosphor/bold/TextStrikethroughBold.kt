package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.TextStrikethroughBold: ImageVector
    get() {
        if (_TextStrikethroughBold != null) {
            return _TextStrikethroughBold!!
        }
        _TextStrikethroughBold =
            ImageVector
                .Builder(
                    name = "TextStrikethroughBold",
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
                        moveTo(40f, 128f)
                        lineTo(216f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 168f)
                        curveToRelative(0f, 22.09f, 25.07f, 40f, 56f, 40f)
                        reflectiveCurveToRelative(56f, -17.91f, 56f, -40f)
                        curveToRelative(0f, -23.77f, -21.62f, -33f, -45.6f, -40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(75.11f, 88f)
                        curveToRelative(0f, -22.09f, 22f, -40f, 52.89f, -40f)
                        curveToRelative(23f, 0f, 40.24f, 9.87f, 48f, 24f)
                    }
                }.build()

        return _TextStrikethroughBold!!
    }

@Suppress("ObjectPropertyName")
private var _TextStrikethroughBold: ImageVector? = null
