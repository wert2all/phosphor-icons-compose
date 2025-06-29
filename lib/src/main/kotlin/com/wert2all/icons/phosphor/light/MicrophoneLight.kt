package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.MicrophoneLight: ImageVector
    get() {
        if (_MicrophoneLight != null) {
            return _MicrophoneLight!!
        }
        _MicrophoneLight =
            ImageVector
                .Builder(
                    name = "MicrophoneLight",
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
                        moveTo(128f, 24f)
                        lineTo(128f, 24f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 64f)
                        lineTo(168f, 128f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 168f)
                        lineTo(128f, 168f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 128f)
                        lineTo(88f, 64f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 24f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 200f)
                        lineTo(128f, 240f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 128f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -144f, 0f)
                    }
                }.build()

        return _MicrophoneLight!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneLight: ImageVector? = null
