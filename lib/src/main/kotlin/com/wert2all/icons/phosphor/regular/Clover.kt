package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.Clover: ImageVector
    get() {
        if (_Clover != null) {
            return _Clover!!
        }
        _Clover =
            ImageVector
                .Builder(
                    name = "Clover",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
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

        return _Clover!!
    }

@Suppress("ObjectPropertyName")
private var _Clover: ImageVector? = null
