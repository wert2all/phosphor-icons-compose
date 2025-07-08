package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ArrowFatLinesLeftThin: ImageVector
    get() {
        if (_ArrowFatLinesLeftThin != null) {
            return _ArrowFatLinesLeftThin!!
        }
        _ArrowFatLinesLeftThin =
            ImageVector
                .Builder(
                    name = "Thin.ArrowFatLinesLeftThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 176f)
                        lineTo(216f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 176f)
                        lineTo(184f, 80f)
                    }
                }.build()

        return _ArrowFatLinesLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesLeftThin: ImageVector? = null
