package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CardsFill: ImageVector
    get() {
        if (_CardsFill != null) {
            return _CardsFill!!
        }
        _CardsFill =
            ImageVector
                .Builder(
                    name = "CardsFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(40f, 72f)
                        lineTo(184f, 72f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 88f)
                        lineTo(200f, 200f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 216f)
                        lineTo(40f, 216f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 200f)
                        lineTo(24f, 88f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 72f)
                        close()
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(216f, 40f)
                        horizontalLineTo(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineTo(216f)
                        verticalLineTo(176f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                        close()
                    }
                }.build()

        return _CardsFill!!
    }

@Suppress("ObjectPropertyName")
private var _CardsFill: ImageVector? = null
