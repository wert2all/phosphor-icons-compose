package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ArrowLineDownLeftBold: ImageVector
    get() {
        if (_ArrowLineDownLeftBold != null) {
            return _ArrowLineDownLeftBold!!
        }
        _ArrowLineDownLeftBold =
            ImageVector
                .Builder(
                    name = "ArrowLineDownLeftBold",
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
                        moveTo(48f, 48f)
                        lineTo(224f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 208f)
                        lineTo(184f, 96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 112f)
                        lineToRelative(0f, 96f)
                        lineToRelative(96f, 0f)
                    }
                }.build()

        return _ArrowLineDownLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLineDownLeftBold: ImageVector? = null
