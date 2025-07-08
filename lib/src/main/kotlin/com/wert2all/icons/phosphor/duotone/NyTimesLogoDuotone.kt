package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.NyTimesLogoDuotone: ImageVector
    get() {
        if (_NyTimesLogoDuotone != null) {
            return _NyTimesLogoDuotone!!
        }
        _NyTimesLogoDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.NyTimesLogoDuotone",
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
                        moveTo(128f, 224f)
                        arcToRelative(79.75f, 79.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -6.66f)
                        verticalLineTo(129.07f)
                        lineTo(128f, 112f)
                        close()
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(172f, 148f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 129.07f)
                        lineTo(96f, 217.34f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48.66f, 154.31f)
                        lineToRelative(79.34f, -42.31f)
                        lineToRelative(0f, 112f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(204.34f, 168f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120.23f, 64.37f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64.19f, 95.74f)
                        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, 40f)
                        lineTo(188f, 96f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -56f)
                    }
                }.build()

        return _NyTimesLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _NyTimesLogoDuotone: ImageVector? = null
