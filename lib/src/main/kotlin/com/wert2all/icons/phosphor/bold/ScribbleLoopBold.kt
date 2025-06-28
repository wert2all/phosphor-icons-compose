package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ScribbleLoopBold: ImageVector
    get() {
        if (_ScribbleLoopBold != null) {
            return _ScribbleLoopBold!!
        }
        _ScribbleLoopBold =
            ImageVector
                .Builder(
                    name = "ScribbleLoopBold",
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
                        moveTo(28f, 92.8f)
                        reflectiveCurveTo(60f, 48f, 108f, 48f)
                        curveToRelative(104f, 0f, 92.6f, 160f, -3.4f, 160f)
                        curveToRelative(-64f, 0f, -64f, -96f, 32f, -96f)
                        curveToRelative(64f, 0f, 107.4f, 48f, 107.4f, 48f)
                    }
                }.build()

        return _ScribbleLoopBold!!
    }

@Suppress("ObjectPropertyName")
private var _ScribbleLoopBold: ImageVector? = null
