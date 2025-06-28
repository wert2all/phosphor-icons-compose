package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ArrowFatLinesLeftLight: ImageVector
    get() {
        if (_ArrowFatLinesLeftLight != null) {
            return _ArrowFatLinesLeftLight!!
        }
        _ArrowFatLinesLeftLight =
            ImageVector
                .Builder(
                    name = "ArrowFatLinesLeftLight",
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
                        moveTo(120f, 32f)
                        lineToRelative(-96f, 96f)
                        lineToRelative(96f, 96f)
                        lineToRelative(0f, -48f)
                        lineToRelative(32f, 0f)
                        lineToRelative(0f, -96f)
                        lineToRelative(-32f, 0f)
                        lineToRelative(0f, -48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 176f)
                        lineTo(216f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 176f)
                        lineTo(184f, 80f)
                    }
                }.build()

        return _ArrowFatLinesLeftLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesLeftLight: ImageVector? = null
