package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.ArrowFatUpThin: ImageVector
    get() {
        if (_ArrowFatUpThin != null) {
            return _ArrowFatUpThin!!
        }
        _ArrowFatUpThin =
            ImageVector
                .Builder(
                    name = "ArrowFatUpThin",
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
                        moveTo(32f, 120f)
                        lineToRelative(96f, -96f)
                        lineToRelative(96f, 96f)
                        horizontalLineTo(176f)
                        verticalLineToRelative(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(120f)
                        close()
                    }
                }.build()

        return _ArrowFatUpThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatUpThin: ImageVector? = null
