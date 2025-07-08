package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.CaretLineUpDuotone: ImageVector
    get() {
        if (_CaretLineUpDuotone != null) {
            return _CaretLineUpDuotone!!
        }
        _CaretLineUpDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.CaretLineUpDuotone",
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
                        moveTo(48f, 192f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                        lineToRelative(-160f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 192f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                        lineToRelative(-160f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 72f)
                        lineTo(208f, 72f)
                    }
                }.build()

        return _CaretLineUpDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineUpDuotone: ImageVector? = null
