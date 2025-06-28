package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.LessThanBold: ImageVector
    get() {
        if (_LessThanBold != null) {
            return _LessThanBold!!
        }
        _LessThanBold =
            ImageVector
                .Builder(
                    name = "LessThanBold",
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
                        moveTo(200f, 56f)
                        lineToRelative(-152f, 72f)
                        lineToRelative(152f, 72f)
                    }
                }.build()

        return _LessThanBold!!
    }

@Suppress("ObjectPropertyName")
private var _LessThanBold: ImageVector? = null
