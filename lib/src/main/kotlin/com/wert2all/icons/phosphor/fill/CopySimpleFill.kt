package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CopySimpleFill: ImageVector
    get() {
        if (_CopySimpleFill != null) {
            return _CopySimpleFill!!
        }
        _CopySimpleFill =
            ImageVector
                .Builder(
                    name = "CopySimpleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(192f, 72f)
                        lineTo(192f, 216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        lineTo(40f, 224f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        lineTo(32f, 72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        lineTo(184f, 64f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 72f)
                        close()
                        moveTo(216f, 32f)
                        lineTo(72f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        lineTo(208f, 48f)
                        lineTo(208f, 184f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(224f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 32f)
                        close()
                    }
                }.build()

        return _CopySimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _CopySimpleFill: ImageVector? = null
