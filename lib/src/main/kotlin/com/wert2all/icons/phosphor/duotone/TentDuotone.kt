package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.TentDuotone: ImageVector
    get() {
        if (_TentDuotone != null) {
            return _TentDuotone!!
        }
        _TentDuotone =
            ImageVector
                .Builder(
                    name = "TentDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(72f, 48f)
                        lineToRelative(-64f, 144f)
                        lineToRelative(128f, 0f)
                        lineToRelative(-64f, -144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 48f)
                        lineToRelative(-64f, 144f)
                        lineToRelative(128f, 0f)
                        lineToRelative(-64f, -144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 192f)
                        lineToRelative(112f, 0f)
                        lineToRelative(-64f, -144f)
                        lineToRelative(-112f, 0f)
                        lineToRelative(0f, 144f)
                    }
                }.build()

        return _TentDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TentDuotone: ImageVector? = null
