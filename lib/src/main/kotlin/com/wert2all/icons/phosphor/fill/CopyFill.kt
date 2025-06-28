package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CopyFill: ImageVector
    get() {
        if (_CopyFill != null) {
            return _CopyFill!!
        }
        _CopyFill =
            ImageVector
                .Builder(
                    name = "CopyFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(216f, 32f)
                        lineTo(88f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        lineTo(80f, 80f)
                        lineTo(40f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        lineTo(32f, 216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        lineTo(168f, 224f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        lineTo(176f, 176f)
                        horizontalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        lineTo(224f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 32f)
                        close()
                        moveTo(208f, 160f)
                        lineTo(176f, 160f)
                        lineTo(176f, 88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        lineTo(96f, 80f)
                        lineTo(96f, 48f)
                        lineTo(208f, 48f)
                        close()
                    }
                }.build()

        return _CopyFill!!
    }

@Suppress("ObjectPropertyName")
private var _CopyFill: ImageVector? = null
