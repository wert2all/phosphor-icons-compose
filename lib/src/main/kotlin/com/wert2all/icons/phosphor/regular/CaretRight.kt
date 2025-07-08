package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.CaretRight: ImageVector
    get() {
        if (_CaretRight != null) {
            return _CaretRight!!
        }
        _CaretRight =
            ImageVector
                .Builder(
                    name = "Regular.CaretRight",
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
                        moveTo(96f, 48f)
                        lineToRelative(80f, 80f)
                        lineToRelative(-80f, 80f)
                    }
                }.build()

        return _CaretRight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretRight: ImageVector? = null
