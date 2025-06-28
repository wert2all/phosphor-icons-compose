package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.GreaterThanOrEqual: ImageVector
    get() {
        if (_GreaterThanOrEqual != null) {
            return _GreaterThanOrEqual!!
        }
        _GreaterThanOrEqual =
            ImageVector
                .Builder(
                    name = "GreaterThanOrEqual",
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
                        moveTo(56f, 48f)
                        lineToRelative(152f, 56f)
                        lineToRelative(-152f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 200f)
                        lineTo(56f, 200f)
                    }
                }.build()

        return _GreaterThanOrEqual!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThanOrEqual: ImageVector? = null
