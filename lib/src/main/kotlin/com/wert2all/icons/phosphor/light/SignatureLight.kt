package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.SignatureLight: ImageVector
    get() {
        if (_SignatureLight != null) {
            return _SignatureLight!!
        }
        _SignatureLight =
            ImageVector
                .Builder(
                    name = "SignatureLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 176f)
                        lineTo(232f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 224f)
                        reflectiveCurveTo(139.52f, 32f, 77.91f, 32f)
                        curveTo(32.07f, 32f, 31.58f, 225.11f, 128f, 104.19f)
                        curveToRelative(0f, 0f, 8.11f, 39.44f, 27.23f, 39.81f)
                        curveToRelative(7.72f, 0.15f, 17.25f, -6.31f, 28.77f, -24f)
                        curveToRelative(0f, 0f, 0f, 24f, 48f, 24f)
                    }
                }.build()

        return _SignatureLight!!
    }

@Suppress("ObjectPropertyName")
private var _SignatureLight: ImageVector? = null
