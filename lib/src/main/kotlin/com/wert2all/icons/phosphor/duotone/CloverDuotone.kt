package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CloverDuotone: ImageVector
    get() {
        if (_CloverDuotone != null) {
            return _CloverDuotone!!
        }
        _CloverDuotone =
            ImageVector
                .Builder(
                    name = "CloverDuotone",
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
                        moveTo(128f, 24f)
                        curveToRelative(-90f, 0f, 0f, 96f, 0f, 96f)
                        reflectiveCurveTo(218f, 24f, 128f, 24f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(32f, 120f)
                        curveToRelative(0f, 90f, 96f, 0f, 96f, 0f)
                        reflectiveCurveTo(32f, 30f, 32f, 120f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(128f, 216f)
                        curveToRelative(90f, 0f, 0f, -96f, 0f, -96f)
                        reflectiveCurveTo(38f, 216f, 128f, 216f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(128f, 120f)
                        reflectiveCurveToRelative(96f, 90f, 96f, 0f)
                        reflectiveCurveTo(128f, 120f, 128f, 120f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 120f)
                        reflectiveCurveToRelative(90f, -96f, 0f, -96f)
                        reflectiveCurveTo(128f, 120f, 128f, 120f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 120f)
                        reflectiveCurveToRelative(-96f, -90f, -96f, 0f)
                        reflectiveCurveTo(128f, 120f, 128f, 120f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 120f)
                        reflectiveCurveToRelative(-90f, 96f, 0f, 96f)
                        reflectiveCurveTo(128f, 120f, 128f, 120f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 120f)
                        reflectiveCurveToRelative(96f, 90f, 96f, 0f)
                        reflectiveCurveTo(128f, 120f, 128f, 120f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 120f)
                        reflectiveCurveToRelative(64f, 56f, 80f, 120f)
                    }
                }.build()

        return _CloverDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CloverDuotone: ImageVector? = null
