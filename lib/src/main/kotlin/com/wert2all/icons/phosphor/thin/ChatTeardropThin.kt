package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.ChatTeardropThin: ImageVector
    get() {
        if (_ChatTeardropThin != null) {
            return _ChatTeardropThin!!
        }
        _ChatTeardropThin =
            ImageVector
                .Builder(
                    name = "ChatTeardropThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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

        return _ChatTeardropThin!!
    }

@Suppress("ObjectPropertyName")
private var _ChatTeardropThin: ImageVector? = null
