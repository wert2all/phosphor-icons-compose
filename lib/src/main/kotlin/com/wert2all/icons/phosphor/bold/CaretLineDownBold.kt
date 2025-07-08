package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.CaretLineDownBold: ImageVector
    get() {
        if (_CaretLineDownBold != null) {
            return _CaretLineDownBold!!
        }
        _CaretLineDownBold =
            ImageVector
                .Builder(
                    name = "Bold.CaretLineDownBold",
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
                        moveTo(208f, 72f)
                        lineToRelative(-80f, 80f)
                        lineToRelative(-80f, -80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 192f)
                        lineTo(208f, 192f)
                    }
                }.build()

        return _CaretLineDownBold!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineDownBold: ImageVector? = null
