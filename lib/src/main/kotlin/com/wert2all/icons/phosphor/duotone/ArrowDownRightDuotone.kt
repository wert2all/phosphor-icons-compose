package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ArrowDownRightDuotone: ImageVector
    get() {
        if (_ArrowDownRightDuotone != null) {
            return _ArrowDownRightDuotone!!
        }
        _ArrowDownRightDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ArrowDownRightDuotone",
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
                        moveTo(88f, 192f)
                        lineToRelative(104f, 0f)
                        lineToRelative(0f, -104f)
                        lineToRelative(-104f, 104f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 64f)
                        lineTo(140f, 140f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 192f)
                        lineToRelative(104f, 0f)
                        lineToRelative(0f, -104f)
                        lineToRelative(-104f, 104f)
                        close()
                    }
                }.build()

        return _ArrowDownRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRightDuotone: ImageVector? = null
