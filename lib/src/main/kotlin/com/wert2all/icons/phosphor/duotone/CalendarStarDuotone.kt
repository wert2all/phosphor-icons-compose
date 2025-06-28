package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CalendarStarDuotone: ImageVector
    get() {
        if (_CalendarStarDuotone != null) {
            return _CalendarStarDuotone!!
        }
        _CalendarStarDuotone =
            ImageVector
                .Builder(
                    name = "CalendarStarDuotone",
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
                        moveTo(128f, 158.54f)
                        lineToRelative(29.67f, 17.46f)
                        lineToRelative(-8.07f, -32.59f)
                        lineToRelative(26.4f, -21.8f)
                        lineToRelative(-34.65f, -2.67f)
                        lineToRelative(-13.35f, -30.94f)
                        lineToRelative(-13.35f, 30.94f)
                        lineToRelative(-34.65f, 2.67f)
                        lineToRelative(26.4f, 21.8f)
                        lineToRelative(-8.07f, 32.59f)
                        lineToRelative(29.67f, -17.46f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 24f)
                        lineTo(80f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 40f)
                        lineTo(208f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                        lineTo(216f, 208f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 216f)
                        lineTo(48f, 216f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 208f)
                        lineTo(40f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 24f)
                        lineTo(176f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 158.54f)
                        lineToRelative(29.67f, 17.46f)
                        lineToRelative(-8.07f, -32.59f)
                        lineToRelative(26.4f, -21.8f)
                        lineToRelative(-34.65f, -2.67f)
                        lineToRelative(-13.35f, -30.94f)
                        lineToRelative(-13.35f, 30.94f)
                        lineToRelative(-34.65f, 2.67f)
                        lineToRelative(26.4f, 21.8f)
                        lineToRelative(-8.07f, 32.59f)
                        lineToRelative(29.67f, -17.46f)
                        close()
                    }
                }.build()

        return _CalendarStarDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarStarDuotone: ImageVector? = null
