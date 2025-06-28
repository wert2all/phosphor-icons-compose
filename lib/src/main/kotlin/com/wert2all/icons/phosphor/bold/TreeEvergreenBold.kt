package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.TreeEvergreenBold: ImageVector
    get() {
        if (_TreeEvergreenBold != null) {
            return _TreeEvergreenBold!!
        }
        _TreeEvergreenBold =
            ImageVector
                .Builder(
                    name = "TreeEvergreenBold",
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
                        moveTo(128f, 16f)
                        lineToRelative(-80f, 104f)
                        lineToRelative(40f, 0f)
                        lineToRelative(-56f, 72f)
                        lineToRelative(192f, 0f)
                        lineToRelative(-56f, -72f)
                        lineToRelative(40f, 0f)
                        lineToRelative(-80f, -104f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 192f)
                        lineTo(128f, 240f)
                    }
                }.build()

        return _TreeEvergreenBold!!
    }

@Suppress("ObjectPropertyName")
private var _TreeEvergreenBold: ImageVector? = null
