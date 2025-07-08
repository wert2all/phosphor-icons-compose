package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.EggBold: ImageVector
    get() {
        if (_EggBold != null) {
            return _EggBold!!
        }
        _EggBold =
            ImageVector
                .Builder(
                    name = "Bold.EggBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 152f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -160f, 0f)
                        curveTo(48f, 88f, 96f, 24f, 128f, 24f)
                        reflectiveCurveTo(208f, 88f, 208f, 152f)
                        close()
                    }
                }.build()

        return _EggBold!!
    }

@Suppress("ObjectPropertyName")
private var _EggBold: ImageVector? = null
