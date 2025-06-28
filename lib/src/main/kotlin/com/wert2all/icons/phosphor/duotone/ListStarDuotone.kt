package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ListStarDuotone: ImageVector
    get() {
        if (_ListStarDuotone != null) {
            return _ListStarDuotone!!
        }
        _ListStarDuotone =
            ImageVector
                .Builder(
                    name = "ListStarDuotone",
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
                        moveTo(184f, 174.54f)
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
                        moveTo(40f, 64f)
                        lineTo(216f, 64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 128f)
                        lineTo(96f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 192f)
                        lineTo(112f, 192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 174.54f)
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

        return _ListStarDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ListStarDuotone: ImageVector? = null
