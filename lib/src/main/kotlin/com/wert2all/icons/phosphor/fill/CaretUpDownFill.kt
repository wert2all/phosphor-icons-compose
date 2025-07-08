package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.CaretUpDownFill: ImageVector
    get() {
        if (_CaretUpDownFill != null) {
            return _CaretUpDownFill!!
        }
        _CaretUpDownFill =
            ImageVector
                .Builder(
                    name = "Fill.CaretUpDownFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(183.39f, 172.94f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.73f, 8.72f)
                        lineToRelative(-48f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-48f, -48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 168f)
                        horizontalLineToRelative(96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 183.39f, 172.94f)
                        close()
                        moveTo(80f, 88f)
                        horizontalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
                        lineToRelative(-48f, -48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                        lineToRelative(-48f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 88f)
                        close()
                    }
                }.build()

        return _CaretUpDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUpDownFill: ImageVector? = null
