package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.LockOpenFill: ImageVector
    get() {
        if (_LockOpenFill != null) {
            return _LockOpenFill!!
        }
        _LockOpenFill =
            ImageVector
                .Builder(
                    name = "LockOpenFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(208f, 80f)
                        lineTo(96f, 80f)
                        lineTo(96f, 56f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                        curveToRelative(15.37f, 0f, 29.2f, 11f, 32.16f, 25.59f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.68f, -3.18f)
                        curveTo(171.32f, 24.15f, 151.2f, 8f, 128f, 8f)
                        arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 56f)
                        lineTo(80f, 80f)
                        lineTo(48f, 80f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 96f)
                        lineTo(32f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(208f, 224f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(224f, 96f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 80f)
                        close()
                        moveTo(128f, 164f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 164f)
                        close()
                    }
                }.build()

        return _LockOpenFill!!
    }

@Suppress("ObjectPropertyName")
private var _LockOpenFill: ImageVector? = null
