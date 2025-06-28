package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CornersInDuotone: ImageVector
    get() {
        if (_CornersInDuotone != null) {
            return _CornersInDuotone!!
        }
        _CornersInDuotone =
            ImageVector
                .Builder(
                    name = "CornersInDuotone",
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
                        moveTo(64f, 48f)
                        lineTo(192f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 64f)
                        lineTo(208f, 192f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 208f)
                        lineTo(64f, 208f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 192f)
                        lineTo(48f, 64f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 96f)
                        lineToRelative(-48f, 0f)
                        lineToRelative(0f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 160f)
                        lineToRelative(48f, 0f)
                        lineToRelative(0f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 208f)
                        lineToRelative(0f, -48f)
                        lineToRelative(48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 48f)
                        lineToRelative(0f, 48f)
                        lineToRelative(-48f, 0f)
                    }
                }.build()

        return _CornersInDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CornersInDuotone: ImageVector? = null
