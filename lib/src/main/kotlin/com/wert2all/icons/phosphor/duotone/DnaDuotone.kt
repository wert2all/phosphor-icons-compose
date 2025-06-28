package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.DnaDuotone: ImageVector
    get() {
        if (_DnaDuotone != null) {
            return _DnaDuotone!!
        }
        _DnaDuotone =
            ImageVector
                .Builder(
                    name = "DnaDuotone",
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
                        moveTo(64f, 208f)
                        verticalLineToRelative(-3.5f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39.8f, -64.4f)
                        lineToRelative(48.4f, -24.2f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 51.5f)
                        verticalLineTo(48f)
                        horizontalLineTo(64f)
                        verticalLineToRelative(3.5f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 39.8f, 64.4f)
                        lineToRelative(48.4f, 24.2f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 204.5f)
                        verticalLineTo(208f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 48f)
                        lineTo(192f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 24f)
                        verticalLineTo(51.5f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 39.8f, 64.4f)
                        lineToRelative(48.4f, 24.2f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 204.5f)
                        verticalLineTo(232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 208f)
                        lineTo(160f, 208f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(107.89f, 80f)
                        lineTo(186.12f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(69.88f, 176f)
                        lineTo(148.11f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(93.38f, 146.47f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 204.5f)
                        verticalLineTo(232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 24f)
                        verticalLineTo(51.5f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -29.38f, 58f)
                    }
                }.build()

        return _DnaDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _DnaDuotone: ImageVector? = null
