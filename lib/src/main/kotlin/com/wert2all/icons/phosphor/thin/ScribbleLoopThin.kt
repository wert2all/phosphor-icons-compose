package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.ScribbleLoopThin: ImageVector
    get() {
        if (_ScribbleLoopThin != null) {
            return _ScribbleLoopThin!!
        }
        _ScribbleLoopThin =
            ImageVector
                .Builder(
                    name = "ScribbleLoopThin",
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
                        moveTo(32f, 92.8f)
                        reflectiveCurveTo(64f, 48f, 112f, 48f)
                        curveToRelative(104f, 0f, 92.6f, 160f, -3.4f, 160f)
                        curveToRelative(-64f, 0f, -64f, -96f, 32f, -96f)
                        curveToRelative(64f, 0f, 107.4f, 48f, 107.4f, 48f)
                    }
                }.build()

        return _ScribbleLoopThin!!
    }

@Suppress("ObjectPropertyName")
private var _ScribbleLoopThin: ImageVector? = null
