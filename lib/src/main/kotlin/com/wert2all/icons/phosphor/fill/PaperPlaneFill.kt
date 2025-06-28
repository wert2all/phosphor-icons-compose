package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.PaperPlaneFill: ImageVector
    get() {
        if (_PaperPlaneFill != null) {
            return _PaperPlaneFill!!
        }
        _PaperPlaneFill =
            ImageVector
                .Builder(
                    name = "PaperPlaneFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(236.2f, 218.31f)
                        arcTo(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 224f)
                        arcToRelative(16.22f, 16.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.37f, -0.92f)
                        lineToRelative(-79.95f, -27f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.72f, -3.79f)
                        verticalLineTo(120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.53f, -8f)
                        arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.47f, 8.26f)
                        verticalLineToRelative(72f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.72f, 3.79f)
                        lineToRelative(-79.95f, 27f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -19.26f, -22.92f)
                        lineTo(114f, 32.13f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.89f, 0f)
                        lineTo(237.9f, 200.1f)
                        arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 236.2f, 218.31f)
                        close()
                    }
                }.build()

        return _PaperPlaneFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaperPlaneFill: ImageVector? = null
