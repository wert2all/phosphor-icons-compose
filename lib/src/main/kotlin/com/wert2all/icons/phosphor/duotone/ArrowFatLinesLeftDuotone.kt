package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ArrowFatLinesLeftDuotone: ImageVector
    get() {
        if (_ArrowFatLinesLeftDuotone != null) {
            return _ArrowFatLinesLeftDuotone!!
        }
        _ArrowFatLinesLeftDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ArrowFatLinesLeftDuotone",
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
                        moveTo(120f, 32f)
                        lineToRelative(-96f, 96f)
                        lineToRelative(96f, 96f)
                        lineToRelative(0f, -48f)
                        lineToRelative(32f, 0f)
                        lineToRelative(0f, -96f)
                        lineToRelative(-32f, 0f)
                        lineToRelative(0f, -48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(120f, 32f)
                        lineToRelative(-96f, 96f)
                        lineToRelative(96f, 96f)
                        lineToRelative(0f, -48f)
                        lineToRelative(32f, 0f)
                        lineToRelative(0f, -96f)
                        lineToRelative(-32f, 0f)
                        lineToRelative(0f, -48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 176f)
                        lineTo(216f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 176f)
                        lineTo(184f, 80f)
                    }
                }.build()

        return _ArrowFatLinesLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesLeftDuotone: ImageVector? = null
