package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.FileMinusFill: ImageVector
    get() {
        if (_FileMinusFill != null) {
            return _FileMinusFill!!
        }
        _FileMinusFill =
            ImageVector
                .Builder(
                    name = "FileMinusFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(213.66f, 82.34f)
                        lineToRelative(-56f, -56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 24f)
                        lineTo(56f, 24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                        lineTo(40f, 216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(200f, 232f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(216f, 88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 213.66f, 82.34f)
                        close()
                        moveTo(152f, 160f)
                        lineTo(104f, 160f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        close()
                        moveTo(152f, 88f)
                        lineTo(152f, 43.31f)
                        lineTo(196.69f, 88f)
                        close()
                    }
                }.build()

        return _FileMinusFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileMinusFill: ImageVector? = null
