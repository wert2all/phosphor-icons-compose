package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.ArrowFatLinesRight: ImageVector
    get() {
        if (_ArrowFatLinesRight != null) {
            return _ArrowFatLinesRight!!
        }
        _ArrowFatLinesRight =
            ImageVector
                .Builder(
                    name = "ArrowFatLinesRight",
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
                        moveTo(136f, 32f)
                        lineToRelative(96f, 96f)
                        lineToRelative(-96f, 96f)
                        lineToRelative(0f, -48f)
                        lineToRelative(-32f, 0f)
                        lineToRelative(0f, -96f)
                        lineToRelative(32f, 0f)
                        lineToRelative(0f, -48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 176f)
                        lineTo(40f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 176f)
                        lineTo(72f, 80f)
                    }
                }.build()

        return _ArrowFatLinesRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesRight: ImageVector? = null
