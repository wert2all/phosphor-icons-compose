package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.PaperclipHorizontalBold: ImageVector
    get() {
        if (_PaperclipHorizontalBold != null) {
            return _PaperclipHorizontalBold!!
        }
        _PaperclipHorizontalBold =
            ImageVector
                .Builder(
                    name = "PaperclipHorizontalBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 120f)
                        horizontalLineTo(44f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 56f)
                        horizontalLineTo(192f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -96f)
                        horizontalLineTo(80f)
                    }
                }.build()

        return _PaperclipHorizontalBold!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipHorizontalBold: ImageVector? = null
