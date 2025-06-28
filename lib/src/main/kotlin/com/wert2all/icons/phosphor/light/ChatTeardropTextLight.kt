package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.ChatTeardropTextLight: ImageVector
    get() {
        if (_ChatTeardropTextLight != null) {
            return _ChatTeardropTextLight!!
        }
        _ChatTeardropTextLight =
            ImageVector
                .Builder(
                    name = "ChatTeardropTextLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 112f)
                        lineTo(164f, 112f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 144f)
                        lineTo(164f, 144f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(132f, 216f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(124f)
                        arcToRelative(92f, 92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, -92f)
                        horizontalLineToRelative(0f)
                        arcToRelative(92f, 92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 92f)
                        horizontalLineToRelative(0f)
                        arcTo(92f, 92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 216f)
                        close()
                    }
                }.build()

        return _ChatTeardropTextLight!!
    }

@Suppress("ObjectPropertyName")
private var _ChatTeardropTextLight: ImageVector? = null
