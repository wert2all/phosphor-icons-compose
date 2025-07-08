package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ChartLineThin: ImageVector
    get() {
        if (_ChartLineThin != null) {
            return _ChartLineThin!!
        }
        _ChartLineThin =
            ImageVector
                .Builder(
                    name = "Thin.ChartLineThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 208f)
                        lineToRelative(-192f, 0f)
                        lineToRelative(0f, -160f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 96f)
                        lineToRelative(-64f, 56f)
                        lineToRelative(-64f, -48f)
                        lineToRelative(-64f, 56f)
                    }
                }.build()

        return _ChartLineThin!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLineThin: ImageVector? = null
