package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.ChartLineDown: ImageVector
    get() {
        if (_ChartLineDown != null) {
            return _ChartLineDown!!
        }
        _ChartLineDown =
            ImageVector
                .Builder(
                    name = "Regular.ChartLineDown",
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
                        moveTo(200f, 168f)
                        lineToRelative(-72f, -72f)
                        lineToRelative(-32f, 32f)
                        lineToRelative(-64f, -64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 128f)
                        lineToRelative(0f, 40f)
                        lineToRelative(-40f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 208f)
                        lineToRelative(-192f, 0f)
                        lineToRelative(0f, -160f)
                    }
                }.build()

        return _ChartLineDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLineDown: ImageVector? = null
