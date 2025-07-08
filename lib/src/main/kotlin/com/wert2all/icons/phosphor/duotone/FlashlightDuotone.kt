package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.FlashlightDuotone: ImageVector
    get() {
        if (_FlashlightDuotone != null) {
            return _FlashlightDuotone!!
        }
        _FlashlightDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.FlashlightDuotone",
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
                        moveTo(192f, 77.33f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 4.8f)
                        lineToRelative(-20.8f, 27.74f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 4.8f)
                        verticalLineTo(224f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(114.67f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -4.8f)
                        lineTo(65.6f, 82.13f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -4.8f)
                        verticalLineTo(64f)
                        horizontalLineTo(192f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 24f)
                        horizontalLineTo(184f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineTo(77.33f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 4.8f)
                        lineToRelative(-20.8f, 27.74f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 4.8f)
                        verticalLineTo(224f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(114.67f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -4.8f)
                        lineTo(65.6f, 82.13f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -4.8f)
                        verticalLineTo(32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 24f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 120f)
                        lineTo(128f, 152f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 64f)
                        lineTo(192f, 64f)
                    }
                }.build()

        return _FlashlightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FlashlightDuotone: ImageVector? = null
