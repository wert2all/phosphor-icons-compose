package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ArrowLineDownRightDuotone: ImageVector
    get() {
        if (_ArrowLineDownRightDuotone != null) {
            return _ArrowLineDownRightDuotone!!
        }
        _ArrowLineDownRightDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ArrowLineDownRightDuotone",
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
                        moveTo(192f, 104f)
                        lineToRelative(0f, 96f)
                        lineToRelative(-96f, 0f)
                        lineToRelative(96f, -96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 40f)
                        lineTo(216f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 88f)
                        lineTo(144f, 152f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 104f)
                        lineToRelative(0f, 96f)
                        lineToRelative(-96f, 0f)
                        lineToRelative(96f, -96f)
                        close()
                    }
                }.build()

        return _ArrowLineDownRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLineDownRightDuotone: ImageVector? = null
