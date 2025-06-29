package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowBendDownLeftFill: ImageVector
    get() {
        if (_ArrowBendDownLeftFill != null) {
            return _ArrowBendDownLeftFill!!
        }
        _ArrowBendDownLeftFill =
            ImageVector
                .Builder(
                    name = "ArrowBendDownLeftFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(232f, 56f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 160f)
                        horizontalLineTo(88f)
                        verticalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                        lineToRelative(-48f, -48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                        lineToRelative(48f, -48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 104f)
                        verticalLineToRelative(40f)
                        horizontalLineToRelative(40f)
                        arcToRelative(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, -88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                    }
                }.build()

        return _ArrowBendDownLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendDownLeftFill: ImageVector? = null
