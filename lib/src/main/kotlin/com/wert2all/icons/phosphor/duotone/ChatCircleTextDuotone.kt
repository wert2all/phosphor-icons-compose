package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ChatCircleTextDuotone: ImageVector
    get() {
        if (_ChatCircleTextDuotone != null) {
            return _ChatCircleTextDuotone!!
        }
        _ChatCircleTextDuotone =
            ImageVector
                .Builder(
                    name = "ChatCircleTextDuotone",
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
                        moveTo(79.93f, 211.11f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -35f, -35f)
                        horizontalLineToRelative(0f)
                        lineTo(32.42f, 213.46f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.12f, 10.12f)
                        lineToRelative(37.39f, -12.47f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(79.93f, 211.11f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -35f, -35f)
                        horizontalLineToRelative(0f)
                        lineTo(32.42f, 213.46f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.12f, 10.12f)
                        lineToRelative(37.39f, -12.47f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 112f)
                        lineTo(160f, 112f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 144f)
                        lineTo(160f, 144f)
                    }
                }.build()

        return _ChatCircleTextDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ChatCircleTextDuotone: ImageVector? = null
