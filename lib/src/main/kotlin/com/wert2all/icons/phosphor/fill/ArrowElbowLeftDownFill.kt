package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ArrowElbowLeftDownFill: ImageVector
    get() {
        if (_ArrowElbowLeftDownFill != null) {
            return _ArrowElbowLeftDownFill!!
        }
        _ArrowElbowLeftDownFill =
            ImageVector
                .Builder(
                    name = "Fill.ArrowElbowLeftDownFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(240f, 72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(96f)
                        verticalLineToRelative(80f)
                        horizontalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                        lineToRelative(-48f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-48f, -48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 160f)
                        horizontalLineTo(80f)
                        verticalLineTo(72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineTo(232f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 72f)
                        close()
                    }
                }.build()

        return _ArrowElbowLeftDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowLeftDownFill: ImageVector? = null
