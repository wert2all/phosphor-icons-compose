package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CaretLineDownDuotone: ImageVector
    get() {
        if (_CaretLineDownDuotone != null) {
            return _CaretLineDownDuotone!!
        }
        _CaretLineDownDuotone =
            ImageVector
                .Builder(
                    name = "CaretLineDownDuotone",
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
                        moveTo(208f, 72f)
                        lineToRelative(-80f, 80f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(160f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 72f)
                        lineToRelative(-80f, 80f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(160f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 192f)
                        lineTo(208f, 192f)
                    }
                }.build()

        return _CaretLineDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineDownDuotone: ImageVector? = null
