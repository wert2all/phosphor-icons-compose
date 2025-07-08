package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.TextStrikethrough: ImageVector
    get() {
        if (_TextStrikethrough != null) {
            return _TextStrikethrough!!
        }
        _TextStrikethrough =
            ImageVector
                .Builder(
                    name = "Regular.TextStrikethrough",
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
                        moveTo(40f, 128f)
                        lineTo(216f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(76.33f, 96f)
                        arcToRelative(25.71f, 25.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.22f, -8f)
                        curveToRelative(0f, -22.09f, 22f, -40f, 52.89f, -40f)
                        curveToRelative(23f, 0f, 40.24f, 9.87f, 48f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 168f)
                        curveToRelative(0f, 22.09f, 25.07f, 40f, 56f, 40f)
                        reflectiveCurveToRelative(56f, -17.91f, 56f, -40f)
                        curveToRelative(0f, -23.77f, -21.62f, -33f, -45.6f, -40f)
                    }
                }.build()

        return _TextStrikethrough!!
    }

@Suppress("ObjectPropertyName")
private var _TextStrikethrough: ImageVector? = null
