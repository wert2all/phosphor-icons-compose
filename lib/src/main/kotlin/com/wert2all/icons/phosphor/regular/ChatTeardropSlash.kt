package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.ChatTeardropSlash: ImageVector
    get() {
        if (_ChatTeardropSlash != null) {
            return _ChatTeardropSlash!!
        }
        _ChatTeardropSlash =
            ImageVector
                .Builder(
                    name = "ChatTeardropSlash",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 40f)
                        lineTo(208f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(189.59f, 195.75f)
                        arcTo(91.6f, 91.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 216f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(124f)
                        arcTo(91.72f, 91.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66.05f, 59.85f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(92.19f, 41f)
                        arcTo(91.53f, 91.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 32f)
                        horizontalLineToRelative(0f)
                        arcToRelative(92f, 92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 92f)
                        horizontalLineToRelative(0f)
                        arcToRelative(91.58f, 91.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.2f, 47.51f)
                    }
                }.build()

        return _ChatTeardropSlash!!
    }

@Suppress("ObjectPropertyName")
private var _ChatTeardropSlash: ImageVector? = null
