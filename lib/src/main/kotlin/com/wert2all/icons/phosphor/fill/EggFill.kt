package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.EggFill: ImageVector
    get() {
        if (_EggFill != null) {
            return _EggFill!!
        }
        _EggFill =
            ImageVector
                .Builder(
                    name = "EggFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(216f, 152f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -176f, 0f)
                        curveToRelative(0f, -30.77f, 10.7f, -64.46f, 29.34f, -92.44f)
                        curveTo(87.53f, 32.29f, 109.46f, 16f, 128f, 16f)
                        reflectiveCurveToRelative(40.47f, 16.29f, 58.66f, 43.56f)
                        curveTo(205.3f, 87.54f, 216f, 121.23f, 216f, 152f)
                        close()
                    }
                }.build()

        return _EggFill!!
    }

@Suppress("ObjectPropertyName")
private var _EggFill: ImageVector? = null
