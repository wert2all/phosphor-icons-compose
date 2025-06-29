package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.PencilRulerFill: ImageVector
    get() {
        if (_PencilRulerFill != null) {
            return _PencilRulerFill!!
        }
        _PencilRulerFill =
            ImageVector
                .Builder(
                    name = "PencilRulerFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(224f, 48f)
                        lineTo(224f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        lineTo(160f, 224f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        lineTo(144f, 180f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                        horizontalLineToRelative(36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                        arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.25f, -7.47f)
                        lineTo(148f, 160f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                        lineTo(144f, 140f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                        horizontalLineToRelative(36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                        arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.25f, -7.47f)
                        lineTo(148f, 120f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                        lineTo(144f, 100f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                        horizontalLineToRelative(36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                        arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 183.73f, 80f)
                        lineTo(148f, 80f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                        lineTo(144f, 48f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                        horizontalLineToRelative(48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                        close()
                        moveTo(109.66f, 58.34f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 64f)
                        lineTo(112f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        lineTo(48f, 224f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        lineTo(32f, 64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.34f, -5.66f)
                        lineToRelative(32f, -32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                        close()
                        moveTo(48f, 80f)
                        lineTo(48f, 184f)
                        lineTo(64f, 184f)
                        lineTo(64f, 80f)
                        close()
                        moveTo(80f, 80f)
                        lineTo(80f, 184f)
                        lineTo(96f, 184f)
                        lineTo(96f, 80f)
                        close()
                        moveTo(51.31f, 64f)
                        lineTo(92.69f, 64f)
                        lineTo(72f, 43.31f)
                        close()
                    }
                }.build()

        return _PencilRulerFill!!
    }

@Suppress("ObjectPropertyName")
private var _PencilRulerFill: ImageVector? = null
