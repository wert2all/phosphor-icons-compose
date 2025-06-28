package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ArrowFatLinesUpDuotone: ImageVector
    get() {
        if (_ArrowFatLinesUpDuotone != null) {
            return _ArrowFatLinesUpDuotone!!
        }
        _ArrowFatLinesUpDuotone =
            ImageVector
                .Builder(
                    name = "ArrowFatLinesUpDuotone",
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
                        moveTo(32f, 120f)
                        lineToRelative(96f, -96f)
                        lineToRelative(96f, 96f)
                        lineToRelative(-48f, 0f)
                        lineToRelative(0f, 32f)
                        lineToRelative(-96f, 0f)
                        lineToRelative(0f, -32f)
                        lineToRelative(-48f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 120f)
                        lineToRelative(96f, -96f)
                        lineToRelative(96f, 96f)
                        lineToRelative(-48f, 0f)
                        lineToRelative(0f, 32f)
                        lineToRelative(-96f, 0f)
                        lineToRelative(0f, -32f)
                        lineToRelative(-48f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 216f)
                        lineTo(80f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 184f)
                        lineTo(80f, 184f)
                    }
                }.build()

        return _ArrowFatLinesUpDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesUpDuotone: ImageVector? = null
