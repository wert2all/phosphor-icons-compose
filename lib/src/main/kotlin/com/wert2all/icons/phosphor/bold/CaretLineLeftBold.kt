package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.CaretLineLeftBold: ImageVector
    get() {
        if (_CaretLineLeftBold != null) {
            return _CaretLineLeftBold!!
        }
        _CaretLineLeftBold =
            ImageVector
                .Builder(
                    name = "Bold.CaretLineLeftBold",
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
                        moveTo(192f, 208f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(80f, -80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 48f)
                        lineTo(72f, 208f)
                    }
                }.build()

        return _CaretLineLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineLeftBold: ImageVector? = null
