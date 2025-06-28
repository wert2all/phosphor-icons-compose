package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ChartLineBold: ImageVector
    get() {
        if (_ChartLineBold != null) {
            return _ChartLineBold!!
        }
        _ChartLineBold =
            ImageVector
                .Builder(
                    name = "ChartLineBold",
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
                        moveTo(224f, 208f)
                        lineToRelative(-192f, 0f)
                        lineToRelative(0f, -160f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 96f)
                        lineToRelative(-64f, 56f)
                        lineToRelative(-64f, -48f)
                        lineToRelative(-64f, 56f)
                    }
                }.build()

        return _ChartLineBold!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLineBold: ImageVector? = null
