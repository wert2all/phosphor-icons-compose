package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ArrowsMergeDuotone: ImageVector
    get() {
        if (_ArrowsMergeDuotone != null) {
            return _ArrowsMergeDuotone!!
        }
        _ArrowsMergeDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ArrowsMergeDuotone",
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
                        moveTo(128f, 160f)
                        lineToRelative(-56f, -56f)
                        lineToRelative(0f, -64f)
                        lineToRelative(112f, 0f)
                        lineToRelative(0f, 64f)
                        lineToRelative(-56f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 232f)
                        lineToRelative(0f, -72f)
                        lineToRelative(-56f, -56f)
                        lineToRelative(0f, -64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 200f)
                        lineToRelative(-32f, 32f)
                        lineToRelative(-32f, -32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 40f)
                        lineToRelative(0f, 64f)
                        lineToRelative(-56f, 56f)
                    }
                }.build()

        return _ArrowsMergeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsMergeDuotone: ImageVector? = null
