package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CornersOutDuotone: ImageVector
    get() {
        if (_CornersOutDuotone != null) {
            return _CornersOutDuotone!!
        }
        _CornersOutDuotone =
            ImageVector
                .Builder(
                    name = "CornersOutDuotone",
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
                        moveTo(48f, 48f)
                        horizontalLineToRelative(160f)
                        verticalLineToRelative(160f)
                        horizontalLineToRelative(-160f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 48f)
                        lineToRelative(40f, 0f)
                        lineToRelative(0f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 208f)
                        lineToRelative(-40f, 0f)
                        lineToRelative(0f, -40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 168f)
                        lineToRelative(0f, 40f)
                        lineToRelative(-40f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 88f)
                        lineToRelative(0f, -40f)
                        lineToRelative(40f, 0f)
                    }
                }.build()

        return _CornersOutDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CornersOutDuotone: ImageVector? = null
