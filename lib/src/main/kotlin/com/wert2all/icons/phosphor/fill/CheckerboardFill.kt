package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CheckerboardFill: ImageVector
    get() {
        if (_CheckerboardFill != null) {
            return _CheckerboardFill!!
        }
        _CheckerboardFill =
            ImageVector
                .Builder(
                    name = "CheckerboardFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(208f, 32f)
                        lineTo(48f, 32f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                        lineTo(32f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(208f, 224f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(224f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                        close()
                        moveTo(208f, 208f)
                        lineTo(128f, 208f)
                        lineTo(128f, 128f)
                        lineTo(48f, 128f)
                        lineTo(48f, 48f)
                        horizontalLineToRelative(80f)
                        verticalLineToRelative(80f)
                        horizontalLineToRelative(80f)
                        verticalLineToRelative(80f)
                        close()
                    }
                }.build()

        return _CheckerboardFill!!
    }

@Suppress("ObjectPropertyName")
private var _CheckerboardFill: ImageVector? = null
