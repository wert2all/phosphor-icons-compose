package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CaretLineLeftDuotone: ImageVector
    get() {
        if (_CaretLineLeftDuotone != null) {
            return _CaretLineLeftDuotone!!
        }
        _CaretLineLeftDuotone =
            ImageVector
                .Builder(
                    name = "CaretLineLeftDuotone",
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
                        moveTo(192f, 208f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(80f, -80f)
                        lineToRelative(0f, 160f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 208f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(80f, -80f)
                        lineToRelative(0f, 160f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 48f)
                        lineTo(72f, 208f)
                    }
                }.build()

        return _CaretLineLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineLeftDuotone: ImageVector? = null
