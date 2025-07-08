package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.BookmarkSimpleFill: ImageVector
    get() {
        if (_BookmarkSimpleFill != null) {
            return _BookmarkSimpleFill!!
        }
        _BookmarkSimpleFill =
            ImageVector
                .Builder(
                    name = "Fill.BookmarkSimpleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(184f, 32f)
                        horizontalLineTo(72f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 48f)
                        verticalLineTo(224f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.24f, 6.78f)
                        lineTo(128f, 193.43f)
                        lineToRelative(59.77f, 37.35f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 224f)
                        verticalLineTo(48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 32f)
                        close()
                    }
                }.build()

        return _BookmarkSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkSimpleFill: ImageVector? = null
