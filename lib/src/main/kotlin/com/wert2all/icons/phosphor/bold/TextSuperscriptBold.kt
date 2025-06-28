package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.TextSuperscriptBold: ImageVector
    get() {
        if (_TextSuperscriptBold != null) {
            return _TextSuperscriptBold!!
        }
        _TextSuperscriptBold =
            ImageVector
                .Builder(
                    name = "TextSuperscriptBold",
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
                        moveTo(240f, 144f)
                        horizontalLineTo(192f)
                        lineToRelative(43.17f, -57.56f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 193.37f, 64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 80f)
                        lineTo(144f, 200f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 80f)
                        lineTo(40f, 200f)
                    }
                }.build()

        return _TextSuperscriptBold!!
    }

@Suppress("ObjectPropertyName")
private var _TextSuperscriptBold: ImageVector? = null
