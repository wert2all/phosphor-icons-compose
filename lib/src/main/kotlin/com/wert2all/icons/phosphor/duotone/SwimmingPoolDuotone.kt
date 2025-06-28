package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.SwimmingPoolDuotone: ImageVector
    get() {
        if (_SwimmingPoolDuotone != null) {
            return _SwimmingPoolDuotone!!
        }
        _SwimmingPoolDuotone =
            ImageVector
                .Builder(
                    name = "SwimmingPoolDuotone",
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
                        moveTo(32f, 208f)
                        curveToRelative(24f, 0f, 24f, 16f, 48f, 16f)
                        reflectiveCurveToRelative(24f, -16f, 48f, -16f)
                        reflectiveCurveToRelative(24f, 16f, 48f, 16f)
                        reflectiveCurveToRelative(24f, -16f, 48f, -16f)
                        verticalLineTo(168f)
                        curveToRelative(-24f, 0f, -24f, 16f, -48f, 16f)
                        reflectiveCurveToRelative(-24f, -16f, -48f, -16f)
                        reflectiveCurveToRelative(-24f, 16f, -48f, 16f)
                        reflectiveCurveToRelative(-24f, -16f, -48f, -16f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 56f)
                        lineTo(168f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 88f)
                        lineTo(168f, 88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 120f)
                        lineTo(168f, 120f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 32f)
                        lineTo(88f, 141.39f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 32f)
                        lineTo(168f, 143.29f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 168f)
                        curveToRelative(24f, 0f, 24f, 16f, 48f, 16f)
                        reflectiveCurveToRelative(24f, -16f, 48f, -16f)
                        reflectiveCurveToRelative(24f, 16f, 48f, 16f)
                        reflectiveCurveToRelative(24f, -16f, 48f, -16f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 208f)
                        curveToRelative(24f, 0f, 24f, 16f, 48f, 16f)
                        reflectiveCurveToRelative(24f, -16f, 48f, -16f)
                        reflectiveCurveToRelative(24f, 16f, 48f, 16f)
                        reflectiveCurveToRelative(24f, -16f, 48f, -16f)
                    }
                }.build()

        return _SwimmingPoolDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SwimmingPoolDuotone: ImageVector? = null
