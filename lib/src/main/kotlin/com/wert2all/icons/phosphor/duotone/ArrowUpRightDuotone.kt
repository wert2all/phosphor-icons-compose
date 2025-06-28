package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ArrowUpRightDuotone: ImageVector
    get() {
        if (_ArrowUpRightDuotone != null) {
            return _ArrowUpRightDuotone!!
        }
        _ArrowUpRightDuotone =
            ImageVector
                .Builder(
                    name = "ArrowUpRightDuotone",
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
                        moveTo(88f, 64f)
                        lineToRelative(104f, 0f)
                        lineToRelative(0f, 104f)
                        lineToRelative(-104f, -104f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 192f)
                        lineTo(140f, 116f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 64f)
                        lineToRelative(104f, 0f)
                        lineToRelative(0f, 104f)
                        lineToRelative(-104f, -104f)
                        close()
                    }
                }.build()

        return _ArrowUpRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRightDuotone: ImageVector? = null
