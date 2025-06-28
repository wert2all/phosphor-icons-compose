package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.WrenchFill: ImageVector
    get() {
        if (_WrenchFill != null) {
            return _WrenchFill!!
        }
        _WrenchFill =
            ImageVector
                .Builder(
                    name = "WrenchFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(103.96f, 126.94f)
                        lineTo(103.96f, 126.94f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(232f, 96f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -100.94f, 66f)
                        lineTo(79f, 222.22f)
                        curveToRelative(-0.12f, 0.14f, -0.26f, 0.29f, -0.39f, 0.42f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -45.26f, -45.26f)
                        curveToRelative(0.14f, -0.13f, 0.28f, -0.27f, 0.43f, -0.39f)
                        lineTo(94f, 124.94f)
                        arcToRelative(72.07f, 72.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 83.54f, -98.78f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.93f, 13.19f)
                        lineTo(144f, 80f)
                        lineToRelative(5.66f, 26.35f)
                        lineTo(176f, 112f)
                        lineToRelative(40.65f, -37.52f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.19f, 3.93f)
                        arcTo(72.6f, 72.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 96f)
                        close()
                    }
                }.build()

        return _WrenchFill!!
    }

@Suppress("ObjectPropertyName")
private var _WrenchFill: ImageVector? = null
