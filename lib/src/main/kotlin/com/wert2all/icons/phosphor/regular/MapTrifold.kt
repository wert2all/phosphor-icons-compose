package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.MapTrifold: ImageVector
    get() {
        if (_MapTrifold != null) {
            return _MapTrifold!!
        }
        _MapTrifold =
            ImageVector
                .Builder(
                    name = "MapTrifold",
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
                        moveTo(96f, 184f)
                        lineTo(96f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 72f)
                        lineTo(160f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 184f)
                        lineToRelative(-64f, 16f)
                        lineToRelative(0f, -144f)
                        lineToRelative(64f, -16f)
                        lineToRelative(64f, 32f)
                        lineToRelative(64f, -16f)
                        lineToRelative(0f, 144f)
                        lineToRelative(-64f, 16f)
                        lineToRelative(-64f, -32f)
                        close()
                    }
                }.build()

        return _MapTrifold!!
    }

@Suppress("ObjectPropertyName")
private var _MapTrifold: ImageVector? = null
