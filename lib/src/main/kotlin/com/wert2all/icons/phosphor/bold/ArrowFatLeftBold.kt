package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ArrowFatLeftBold: ImageVector
    get() {
        if (_ArrowFatLeftBold != null) {
            return _ArrowFatLeftBold!!
        }
        _ArrowFatLeftBold =
            ImageVector
                .Builder(
                    name = "ArrowFatLeftBold",
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
                        moveTo(120f, 32f)
                        lineTo(24f, 128f)
                        lineToRelative(96f, 96f)
                        verticalLineTo(176f)
                        horizontalLineToRelative(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        verticalLineTo(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        horizontalLineTo(120f)
                        close()
                    }
                }.build()

        return _ArrowFatLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLeftBold: ImageVector? = null
