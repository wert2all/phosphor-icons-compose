package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.GlobeXDuotone: ImageVector
    get() {
        if (_GlobeXDuotone != null) {
            return _GlobeXDuotone!!
        }
        _GlobeXDuotone =
            ImageVector
                .Builder(
                    name = "GlobeXDuotone",
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
                        moveTo(128f, 128f)
                        moveToRelative(-96f, 0f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 224f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, -96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 224f)
                        reflectiveCurveToRelative(-40f, -32f, -40f, -96f)
                        reflectiveCurveToRelative(40f, -96f, 40f, -96f)
                        reflectiveCurveToRelative(40f, 32f, 40f, 96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(37.46f, 96f)
                        lineTo(218.54f, 96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(37.46f, 160f)
                        lineTo(128f, 160f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 168f)
                        lineTo(216f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 168f)
                        lineTo(168f, 216f)
                    }
                }.build()

        return _GlobeXDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeXDuotone: ImageVector? = null
