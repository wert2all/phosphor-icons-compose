package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.CloverThin: ImageVector
    get() {
        if (_CloverThin != null) {
            return _CloverThin!!
        }
        _CloverThin =
            ImageVector
                .Builder(
                    name = "Thin.CloverThin",
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
                        moveTo(128f, 120f)
                        reflectiveCurveToRelative(90f, -96f, 0f, -96f)
                        reflectiveCurveTo(128f, 120f, 128f, 120f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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
                        strokeLineWidth = 8f,
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
                        strokeLineWidth = 8f,
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
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 120f)
                        reflectiveCurveToRelative(64f, 56f, 80f, 120f)
                    }
                }.build()

        return _CloverThin!!
    }

@Suppress("ObjectPropertyName")
private var _CloverThin: ImageVector? = null
