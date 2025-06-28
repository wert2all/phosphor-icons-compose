package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.JarLabelFill: ImageVector
    get() {
        if (_JarLabelFill != null) {
            return _JarLabelFill!!
        }
        _JarLabelFill =
            ImageVector
                .Builder(
                    name = "JarLabelFill",
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
                        moveTo(168f, 48f)
                        lineTo(152f, 48f)
                        lineTo(152f, 32f)
                        horizontalLineToRelative(16f)
                        close()
                        moveTo(120f, 48f)
                        lineTo(120f, 32f)
                        horizontalLineToRelative(16f)
                        lineTo(136f, 48f)
                        close()
                        moveTo(104f, 32f)
                        lineTo(104f, 48f)
                        lineTo(88f, 48f)
                        lineTo(88f, 32f)
                        close()
                        moveTo(80f, 64f)
                        horizontalLineToRelative(96f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
                        verticalLineToRelative(8f)
                        lineTo(56f, 96f)
                        lineTo(56f, 88f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 64f)
                        close()
                        moveTo(176f, 224f)
                        lineTo(80f, 224f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                        verticalLineToRelative(-8f)
                        lineTo(200f, 192f)
                        verticalLineToRelative(8f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 224f)
                        close()
                    }
                }.build()

        return _JarLabelFill!!
    }

@Suppress("ObjectPropertyName")
private var _JarLabelFill: ImageVector? = null
