package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ArrowUpDuotone: ImageVector
    get() {
        if (_ArrowUpDuotone != null) {
            return _ArrowUpDuotone!!
        }
        _ArrowUpDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ArrowUpDuotone",
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
                        moveTo(56f, 112f)
                        lineToRelative(72f, -72f)
                        lineToRelative(72f, 72f)
                        lineToRelative(-144f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 216f)
                        lineTo(128f, 112f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 112f)
                        lineToRelative(72f, -72f)
                        lineToRelative(72f, 72f)
                        lineToRelative(-144f, 0f)
                        close()
                    }
                }.build()

        return _ArrowUpDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpDuotone: ImageVector? = null
