package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.RainbowDuotone: ImageVector
    get() {
        if (_RainbowDuotone != null) {
            return _RainbowDuotone!!
        }
        _RainbowDuotone =
            ImageVector
                .Builder(
                    name = "RainbowDuotone",
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
                        moveTo(240f, 184f)
                        verticalLineTo(168f)
                        arcToRelative(112f, 112f, 0f, isMoreThanHalf = false, isPositiveArc = false, -224f, 0f)
                        verticalLineToRelative(16f)
                        horizontalLineTo(80f)
                        verticalLineTo(168f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 0f)
                        verticalLineToRelative(16f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 184f)
                        verticalLineTo(168f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 0f)
                        verticalLineToRelative(16f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 184f)
                        verticalLineTo(168f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -160f, 0f)
                        verticalLineToRelative(16f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(240f, 184f)
                        verticalLineTo(168f)
                        arcToRelative(112f, 112f, 0f, isMoreThanHalf = false, isPositiveArc = false, -224f, 0f)
                        verticalLineToRelative(16f)
                    }
                }.build()

        return _RainbowDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _RainbowDuotone: ImageVector? = null
