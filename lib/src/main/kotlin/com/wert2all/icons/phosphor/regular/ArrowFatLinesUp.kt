package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.ArrowFatLinesUp: ImageVector
    get() {
        if (_ArrowFatLinesUp != null) {
            return _ArrowFatLinesUp!!
        }
        _ArrowFatLinesUp =
            ImageVector
                .Builder(
                    name = "Regular.ArrowFatLinesUp",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
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

        return _ArrowFatLinesUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesUp: ImageVector? = null
