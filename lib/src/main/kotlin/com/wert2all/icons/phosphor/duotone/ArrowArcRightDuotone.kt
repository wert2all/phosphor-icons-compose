package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ArrowArcRightDuotone: ImageVector
    get() {
        if (_ArrowArcRightDuotone != null) {
            return _ArrowArcRightDuotone!!
        }
        _ArrowArcRightDuotone =
            ImageVector
                .Builder(
                    name = "ArrowArcRightDuotone",
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
                        moveTo(168f, 152f)
                        lineToRelative(64f, 0f)
                        lineToRelative(0f, -64f)
                        lineToRelative(-64f, 64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 152f)
                        lineToRelative(64f, 0f)
                        lineToRelative(0f, -64f)
                        lineToRelative(-64f, 64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 184f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 163.88f, -67.88f)
                        lineTo(200f, 120f)
                    }
                }.build()

        return _ArrowArcRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowArcRightDuotone: ImageVector? = null
