package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ChartBarHorizontalLight: ImageVector
    get() {
        if (_ChartBarHorizontalLight != null) {
            return _ChartBarHorizontalLight!!
        }
        _ChartBarHorizontalLight =
            ImageVector
                .Builder(
                    name = "ChartBarHorizontalLight",
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
                        moveTo(48f, 216f)
                        lineTo(48f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 56f)
                        lineToRelative(128f, 0f)
                        lineToRelative(0f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 104f)
                        lineToRelative(176f, 0f)
                        lineToRelative(0f, 48f)
                        lineToRelative(-176f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 152f)
                        lineToRelative(0f, 48f)
                        lineToRelative(-96f, 0f)
                    }
                }.build()

        return _ChartBarHorizontalLight!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBarHorizontalLight: ImageVector? = null
