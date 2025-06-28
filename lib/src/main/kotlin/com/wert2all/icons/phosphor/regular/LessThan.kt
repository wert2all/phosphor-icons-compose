package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.LessThan: ImageVector
    get() {
        if (_LessThan != null) {
            return _LessThan!!
        }
        _LessThan =
            ImageVector
                .Builder(
                    name = "LessThan",
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
                        moveTo(200f, 56f)
                        lineToRelative(-152f, 72f)
                        lineToRelative(152f, 72f)
                    }
                }.build()

        return _LessThan!!
    }

@Suppress("ObjectPropertyName")
private var _LessThan: ImageVector? = null
