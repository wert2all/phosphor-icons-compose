package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.VisorLight: ImageVector
    get() {
        if (_VisorLight != null) {
            return _VisorLight!!
        }
        _VisorLight =
            ImageVector
                .Builder(
                    name = "Light.VisorLight",
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
                        moveTo(112.8f, 173.45f)
                        curveToRelative(-11.81f, 9.79f, -27.19f, 19.26f, -43.89f, 18.48f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 64f)
                        horizontalLineTo(183.05f)
                        curveToRelative(35.17f, 0f, 64.49f, 28f, 64.94f, 63.15f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 192f)
                        curveToRelative(-15.48f, 0f, -29.68f, -9.35f, -40.75f, -18.5f)
                        arcTo(23.91f, 23.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112.8f, 173.45f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 96f)
                        lineTo(176f, 96f)
                    }
                }.build()

        return _VisorLight!!
    }

@Suppress("ObjectPropertyName")
private var _VisorLight: ImageVector? = null
