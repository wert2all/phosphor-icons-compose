package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CaretDoubleLeftDuotone: ImageVector
    get() {
        if (_CaretDoubleLeftDuotone != null) {
            return _CaretDoubleLeftDuotone!!
        }
        _CaretDoubleLeftDuotone =
            ImageVector
                .Builder(
                    name = "CaretDoubleLeftDuotone",
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
                        moveTo(200f, 208f)
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
                        moveTo(200f, 208f)
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
                        moveTo(120f, 208f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(80f, -80f)
                    }
                }.build()

        return _CaretDoubleLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleLeftDuotone: ImageVector? = null
