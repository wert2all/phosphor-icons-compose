package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.TentBold: ImageVector
    get() {
        if (_TentBold != null) {
            return _TentBold!!
        }
        _TentBold =
            ImageVector
                .Builder(
                    name = "TentBold",
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
                        moveTo(76f, 48f)
                        lineToRelative(-64f, 144f)
                        lineToRelative(128f, 0f)
                        lineToRelative(-64f, -144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(140f, 192f)
                        lineToRelative(104f, 0f)
                        lineToRelative(-64f, -144f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, 144f)
                    }
                }.build()

        return _TentBold!!
    }

@Suppress("ObjectPropertyName")
private var _TentBold: ImageVector? = null
