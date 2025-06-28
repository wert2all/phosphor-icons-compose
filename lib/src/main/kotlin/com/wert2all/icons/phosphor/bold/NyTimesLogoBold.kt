package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.NyTimesLogoBold: ImageVector
    get() {
        if (_NyTimesLogoBold != null) {
            return _NyTimesLogoBold!!
        }
        _NyTimesLogoBold =
            ImageVector
                .Builder(
                    name = "NyTimesLogoBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(176f, 148f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64.19f, 95.74f)
                        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, 40f)
                        lineTo(188f, 96f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(92f, 133.33f)
                        lineTo(92f, 215.46f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48.94f, 156.3f)
                        lineToRelative(83.06f, -44.3f)
                        lineToRelative(0f, 112f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(199.46f, 180f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120.23f, 64.37f)
                    }
                }.build()

        return _NyTimesLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _NyTimesLogoBold: ImageVector? = null
