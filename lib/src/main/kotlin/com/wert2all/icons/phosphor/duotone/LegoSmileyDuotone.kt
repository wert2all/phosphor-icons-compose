package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.LegoSmileyDuotone: ImageVector
    get() {
        if (_LegoSmileyDuotone != null) {
            return _LegoSmileyDuotone!!
        }
        _LegoSmileyDuotone =
            ImageVector
                .Builder(
                    name = "LegoSmileyDuotone",
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
                        moveTo(72f, 56f)
                        lineTo(184f, 56f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 80f)
                        lineTo(208f, 176f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 200f)
                        lineTo(72f, 200f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 176f)
                        lineTo(48f, 80f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 56f)
                        close()
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(100f, 112f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(156f, 112f)
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
                        moveTo(156f, 152f)
                        arcToRelative(53f, 53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 56f)
                        lineTo(184f, 56f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 80f)
                        lineTo(208f, 176f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 200f)
                        lineTo(72f, 200f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 176f)
                        lineTo(48f, 80f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 56f)
                        verticalLineTo(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineTo(56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 200f)
                        verticalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        verticalLineTo(200f)
                    }
                }.build()

        return _LegoSmileyDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LegoSmileyDuotone: ImageVector? = null
