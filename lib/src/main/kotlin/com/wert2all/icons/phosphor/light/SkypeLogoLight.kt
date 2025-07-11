package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.SkypeLogoLight: ImageVector
    get() {
        if (_SkypeLogoLight != null) {
            return _SkypeLogoLight!!
        }
        _SkypeLogoLight =
            ImageVector
                .Builder(
                    name = "Light.SkypeLogoLight",
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
                        moveTo(96f, 152f)
                        curveToRelative(0f, 13.25f, 14.33f, 24f, 32f, 24f)
                        reflectiveCurveToRelative(32f, -10.75f, 32f, -24f)
                        curveToRelative(0f, -32f, -62.22f, -20f, -62.22f, -48f)
                        curveToRelative(0f, -13.25f, 12.55f, -24f, 30.22f, -24f)
                        curveToRelative(13.25f, 0f, 23.63f, 6f, 28f, 14.66f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(214f, 146.69f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 146.69f, 214f)
                        arcTo(88.07f, 88.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 42f, 109.31f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 109.31f, 42f)
                        arcTo(88.07f, 88.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 214f, 146.69f)
                        close()
                    }
                }.build()

        return _SkypeLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _SkypeLogoLight: ImageVector? = null
