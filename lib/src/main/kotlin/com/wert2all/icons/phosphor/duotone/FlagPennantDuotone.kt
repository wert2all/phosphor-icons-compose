package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.FlagPennantDuotone: ImageVector
    get() {
        if (_FlagPennantDuotone != null) {
            return _FlagPennantDuotone!!
        }
        _FlagPennantDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.FlagPennantDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(56f, 168f)
                        lineToRelative(184f, -64f)
                        lineToRelative(-184f, -64f)
                        lineToRelative(0f, 128f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 168f)
                        lineToRelative(184f, -64f)
                        lineToRelative(-184f, -64f)
                        lineToRelative(0f, 176f)
                    }
                }.build()

        return _FlagPennantDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FlagPennantDuotone: ImageVector? = null
