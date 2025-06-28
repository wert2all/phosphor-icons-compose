package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ClosedCaptioningFill: ImageVector
    get() {
        if (_ClosedCaptioningFill != null) {
            return _ClosedCaptioningFill!!
        }
        _ClosedCaptioningFill =
            ImageVector
                .Builder(
                    name = "ClosedCaptioningFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(224f, 48f)
                        lineTo(32f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 64f)
                        lineTo(16f, 192f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(224f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(240f, 64f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 48f)
                        close()
                        moveTo(116f, 162.64f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -69.28f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 13.85f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 41.58f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13.85f)
                        close()
                        moveTo(196f, 162.64f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -69.28f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 13.85f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 41.58f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13.85f)
                        close()
                    }
                }.build()

        return _ClosedCaptioningFill!!
    }

@Suppress("ObjectPropertyName")
private var _ClosedCaptioningFill: ImageVector? = null
