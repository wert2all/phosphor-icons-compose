package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ArrowsCounterClockwiseThin: ImageVector
    get() {
        if (_ArrowsCounterClockwiseThin != null) {
            return _ArrowsCounterClockwiseThin!!
        }
        _ArrowsCounterClockwiseThin =
            ImageVector
                .Builder(
                    name = "Thin.ArrowsCounterClockwiseThin",
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
                        moveTo(88f, 96f)
                        lineToRelative(-48f, 0f)
                        lineToRelative(0f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 96f)
                        lineTo(68.28f, 67.72f)
                        arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 67f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 160f)
                        lineToRelative(48f, 0f)
                        lineToRelative(0f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 160f)
                        lineToRelative(-28.28f, 28.28f)
                        arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 189f)
                    }
                }.build()

        return _ArrowsCounterClockwiseThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsCounterClockwiseThin: ImageVector? = null
