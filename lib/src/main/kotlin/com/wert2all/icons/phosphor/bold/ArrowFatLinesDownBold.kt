package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ArrowFatLinesDownBold: ImageVector
    get() {
        if (_ArrowFatLinesDownBold != null) {
            return _ArrowFatLinesDownBold!!
        }
        _ArrowFatLinesDownBold =
            ImageVector
                .Builder(
                    name = "ArrowFatLinesDownBold",
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
                        moveTo(32f, 136f)
                        lineToRelative(96f, 96f)
                        lineToRelative(96f, -96f)
                        lineToRelative(-48f, 0f)
                        lineToRelative(0f, -16f)
                        lineToRelative(-96f, 0f)
                        lineToRelative(0f, 16f)
                        lineToRelative(-48f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 40f)
                        lineTo(80f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 80f)
                        lineTo(80f, 80f)
                    }
                }.build()

        return _ArrowFatLinesDownBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesDownBold: ImageVector? = null
