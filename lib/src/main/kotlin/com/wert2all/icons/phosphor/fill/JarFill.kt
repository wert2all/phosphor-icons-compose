package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.JarFill: ImageVector
    get() {
        if (_JarFill != null) {
            return _JarFill!!
        }
        _JarFill =
            ImageVector
                .Builder(
                    name = "JarFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(184f, 48.81f)
                        lineTo(184f, 32f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                        lineTo(88f, 16f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 32f)
                        lineTo(72f, 48.81f)
                        arcTo(40.05f, 40.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 88f)
                        lineTo(40f, 200f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                        horizontalLineToRelative(96f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                        lineTo(216f, 88f)
                        arcTo(40.05f, 40.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 48.81f)
                        close()
                        moveTo(120f, 48f)
                        lineTo(120f, 32f)
                        horizontalLineToRelative(16f)
                        lineTo(136f, 48f)
                        close()
                        moveTo(168f, 48f)
                        lineTo(152f, 48f)
                        lineTo(152f, 32f)
                        horizontalLineToRelative(16f)
                        close()
                        moveTo(104f, 32f)
                        lineTo(104f, 48f)
                        lineTo(88f, 48f)
                        lineTo(88f, 32f)
                        close()
                    }
                }.build()

        return _JarFill!!
    }

@Suppress("ObjectPropertyName")
private var _JarFill: ImageVector? = null
