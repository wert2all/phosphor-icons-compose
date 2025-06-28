package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.NumberCircleFourFill: ImageVector
    get() {
        if (_NumberCircleFourFill != null) {
            return _NumberCircleFourFill!!
        }
        _NumberCircleFourFill =
            ImageVector
                .Builder(
                    name = "NumberCircleFourFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(104.36f, 144f)
                        lineTo(136f, 103.32f)
                        lineTo(136f, 144f)
                        close()
                        moveTo(232f, 128f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                        close()
                        moveTo(168f, 152f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        horizontalLineToRelative(-8f)
                        lineTo(152f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.31f, -4.91f)
                        lineToRelative(-56f, 72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 160f)
                        horizontalLineToRelative(48f)
                        verticalLineToRelative(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(152f, 160f)
                        horizontalLineToRelative(8f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 152f)
                        close()
                    }
                }.build()

        return _NumberCircleFourFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleFourFill: ImageVector? = null
