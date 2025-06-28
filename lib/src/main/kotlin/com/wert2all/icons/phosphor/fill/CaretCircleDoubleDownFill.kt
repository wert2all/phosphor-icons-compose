package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CaretCircleDoubleDownFill: ImageVector
    get() {
        if (_CaretCircleDoubleDownFill != null) {
            return _CaretCircleDoubleDownFill!!
        }
        _CaretCircleDoubleDownFill =
            ImageVector
                .Builder(
                    name = "CaretCircleDoubleDownFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(54.42f, 54.43f)
                        arcToRelative(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 147.15f, 0f)
                        arcTo(104.17f, 104.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.42f, 54.43f)
                        close()
                        moveTo(154.35f, 138.35f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, 11.32f)
                        lineToRelative(-32f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-32f, -32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, -11.32f)
                        lineTo(128f, 164.71f)
                        close()
                        moveTo(154.35f, 82.35f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, 11.32f)
                        lineToRelative(-32f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-32f, -32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, -11.32f)
                        lineTo(128f, 108.68f)
                        close()
                    }
                }.build()

        return _CaretCircleDoubleDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretCircleDoubleDownFill: ImageVector? = null
