package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ThumbsDownFill: ImageVector
    get() {
        if (_ThumbsDownFill != null) {
            return _ThumbsDownFill!!
        }
        _ThumbsDownFill =
            ImageVector
                .Builder(
                    name = "ThumbsDownFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(239.82f, 157f)
                        lineToRelative(-12f, -96f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 204f, 40f)
                        horizontalLineTo(32f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 56f)
                        verticalLineToRelative(88f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineTo(75.06f)
                        lineToRelative(37.78f, 75.58f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 240f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                        verticalLineTo(184f)
                        horizontalLineToRelative(56f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.82f, -27f)
                        close()
                        moveTo(72f, 144f)
                        horizontalLineTo(32f)
                        verticalLineTo(56f)
                        horizontalLineTo(72f)
                        close()
                    }
                }.build()

        return _ThumbsDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbsDownFill: ImageVector? = null
