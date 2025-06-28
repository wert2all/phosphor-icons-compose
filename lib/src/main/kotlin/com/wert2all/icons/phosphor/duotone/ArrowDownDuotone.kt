package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ArrowDownDuotone: ImageVector
    get() {
        if (_ArrowDownDuotone != null) {
            return _ArrowDownDuotone!!
        }
        _ArrowDownDuotone =
            ImageVector
                .Builder(
                    name = "ArrowDownDuotone",
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
                        moveTo(56f, 144f)
                        lineToRelative(72f, 72f)
                        lineToRelative(72f, -72f)
                        lineToRelative(-144f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 144f)
                        lineToRelative(72f, 72f)
                        lineToRelative(72f, -72f)
                        lineToRelative(-144f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 40f)
                        lineTo(128f, 144f)
                    }
                }.build()

        return _ArrowDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownDuotone: ImageVector? = null
