package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.StoolLight: ImageVector
    get() {
        if (_StoolLight != null) {
            return _StoolLight!!
        }
        _StoolLight =
            ImageVector
                .Builder(
                    name = "StoolLight",
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
                        moveTo(72f, 32f)
                        lineTo(184f, 32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 40f)
                        lineTo(192f, 64f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 72f)
                        lineTo(72f, 72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
                        lineTo(64f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 32f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 72f)
                        lineTo(192f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 224f)
                        lineTo(88f, 72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72.84f, 168f)
                        lineTo(183.16f, 168f)
                    }
                }.build()

        return _StoolLight!!
    }

@Suppress("ObjectPropertyName")
private var _StoolLight: ImageVector? = null
