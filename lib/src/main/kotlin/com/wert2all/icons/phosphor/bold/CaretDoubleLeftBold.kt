package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.CaretDoubleLeftBold: ImageVector
    get() {
        if (_CaretDoubleLeftBold != null) {
            return _CaretDoubleLeftBold!!
        }
        _CaretDoubleLeftBold =
            ImageVector
                .Builder(
                    name = "Bold.CaretDoubleLeftBold",
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
                        moveTo(200f, 208f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(80f, -80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(120f, 208f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(80f, -80f)
                    }
                }.build()

        return _CaretDoubleLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleLeftBold: ImageVector? = null
