package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.NeedleBold: ImageVector
    get() {
        if (_NeedleBold != null) {
            return _NeedleBold!!
        }
        _NeedleBold =
            ImageVector
                .Builder(
                    name = "Bold.NeedleBold",
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
                        moveTo(182.63f, 118.63f)
                        lineToRelative(24f, -24f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, -45.26f)
                        lineToRelative(-24f, 24f)
                        curveTo(128f, 128f, 40f, 216f, 40f, 216f)
                        reflectiveCurveTo(128f, 128f, 182.63f, 118.63f)
                        close()
                    }
                }.build()

        return _NeedleBold!!
    }

@Suppress("ObjectPropertyName")
private var _NeedleBold: ImageVector? = null
