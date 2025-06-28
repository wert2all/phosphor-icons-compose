package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.DnaThin: ImageVector
    get() {
        if (_DnaThin != null) {
            return _DnaThin!!
        }
        _DnaThin =
            ImageVector
                .Builder(
                    name = "DnaThin",
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
                        moveTo(96f, 48f)
                        lineTo(192f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 208f)
                        lineTo(160f, 208f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(107.89f, 80f)
                        lineTo(186.12f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(69.88f, 176f)
                        lineTo(148.11f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(93.38f, 146.47f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 204.5f)
                        verticalLineTo(232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 24f)
                        verticalLineTo(51.5f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -29.38f, 58f)
                    }
                }.build()

        return _DnaThin!!
    }

@Suppress("ObjectPropertyName")
private var _DnaThin: ImageVector? = null
