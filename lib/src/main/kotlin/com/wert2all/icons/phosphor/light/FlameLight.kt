package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.FlameLight: ImageVector
    get() {
        if (_FlameLight != null) {
            return _FlameLight!!
        }
        _FlameLight =
            ImageVector
                .Builder(
                    name = "Light.FlameLight",
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
                        moveTo(208f, 144f)
                        curveToRelative(0f, -72f, -80f, -120f, -80f, -120f)
                        reflectiveCurveTo(48f, 72f, 48f, 144f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 184f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 0f)
                        curveToRelative(0f, -40f, -40f, -64f, -40f, -64f)
                        reflectiveCurveTo(88f, 144f, 88f, 184f)
                        close()
                    }
                }.build()

        return _FlameLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlameLight: ImageVector? = null
