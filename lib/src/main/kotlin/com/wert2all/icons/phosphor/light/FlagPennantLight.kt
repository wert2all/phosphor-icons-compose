package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.FlagPennantLight: ImageVector
    get() {
        if (_FlagPennantLight != null) {
            return _FlagPennantLight!!
        }
        _FlagPennantLight =
            ImageVector
                .Builder(
                    name = "FlagPennantLight",
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
                        moveTo(56f, 168f)
                        lineToRelative(184f, -64f)
                        lineToRelative(-184f, -64f)
                        lineToRelative(0f, 176f)
                    }
                }.build()

        return _FlagPennantLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlagPennantLight: ImageVector? = null
