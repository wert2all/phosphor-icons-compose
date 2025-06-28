package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.LessThanOrEqualBold: ImageVector
    get() {
        if (_LessThanOrEqualBold != null) {
            return _LessThanOrEqualBold!!
        }
        _LessThanOrEqualBold =
            ImageVector
                .Builder(
                    name = "LessThanOrEqualBold",
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
                        moveTo(200f, 48f)
                        lineToRelative(-152f, 56f)
                        lineToRelative(152f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 200f)
                        lineTo(48f, 200f)
                    }
                }.build()

        return _LessThanOrEqualBold!!
    }

@Suppress("ObjectPropertyName")
private var _LessThanOrEqualBold: ImageVector? = null
