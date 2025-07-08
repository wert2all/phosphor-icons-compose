package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.CaretDoubleDownDuotone: ImageVector
    get() {
        if (_CaretDoubleDownDuotone != null) {
            return _CaretDoubleDownDuotone!!
        }
        _CaretDoubleDownDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.CaretDoubleDownDuotone",
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
                        moveTo(208f, 56f)
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
                        moveTo(208f, 136f)
                        lineToRelative(-80f, 80f)
                        lineToRelative(-80f, -80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 56f)
                        lineToRelative(-80f, 80f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(160f, 0f)
                        close()
                    }
                }.build()

        return _CaretDoubleDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleDownDuotone: ImageVector? = null
