package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.CaretDoubleUpBold: ImageVector
    get() {
        if (_CaretDoubleUpBold != null) {
            return _CaretDoubleUpBold!!
        }
        _CaretDoubleUpBold =
            ImageVector
                .Builder(
                    name = "Bold.CaretDoubleUpBold",
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
                        moveTo(48f, 200f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 120f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                    }
                }.build()

        return _CaretDoubleUpBold!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleUpBold: ImageVector? = null
