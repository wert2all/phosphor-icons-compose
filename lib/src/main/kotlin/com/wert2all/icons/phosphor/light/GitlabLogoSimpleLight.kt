package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.GitlabLogoSimpleLight: ImageVector
    get() {
        if (_GitlabLogoSimpleLight != null) {
            return _GitlabLogoSimpleLight!!
        }
        _GitlabLogoSimpleLight =
            ImageVector
                .Builder(
                    name = "Light.GitlabLogoSimpleLight",
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
                        moveTo(175.35f, 96f)
                        lineTo(195f, 42.62f)
                        arcToRelative(3.93f, 3.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.53f, 0.38f)
                        lineToRelative(19.89f, 76.12f)
                        arcToRelative(49f, 49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18.87f, 52.4f)
                        lineToRelative(-73.26f, 51.76f)
                        arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.52f, 0f)
                        lineTo(52.48f, 171.52f)
                        arcToRelative(49f, 49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18.87f, -52.4f)
                        lineTo(53.5f, 43f)
                        arcTo(3.93f, 3.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61f, 42.62f)
                        lineTo(80.65f, 96f)
                        close()
                    }
                }.build()

        return _GitlabLogoSimpleLight!!
    }

@Suppress("ObjectPropertyName")
private var _GitlabLogoSimpleLight: ImageVector? = null
