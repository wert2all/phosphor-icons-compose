package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ArrowFatLinesDownLight: ImageVector
    get() {
        if (_ArrowFatLinesDownLight != null) {
            return _ArrowFatLinesDownLight!!
        }
        _ArrowFatLinesDownLight =
            ImageVector
                .Builder(
                    name = "ArrowFatLinesDownLight",
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
                        moveTo(32f, 136f)
                        lineToRelative(96f, 96f)
                        lineToRelative(96f, -96f)
                        lineToRelative(-48f, 0f)
                        lineToRelative(0f, -32f)
                        lineToRelative(-96f, 0f)
                        lineToRelative(0f, 32f)
                        lineToRelative(-48f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 40f)
                        lineTo(80f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 72f)
                        lineTo(80f, 72f)
                    }
                }.build()

        return _ArrowFatLinesDownLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesDownLight: ImageVector? = null
