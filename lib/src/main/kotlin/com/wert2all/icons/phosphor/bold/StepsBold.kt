package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.StepsBold: ImageVector
    get() {
        if (_StepsBold != null) {
            return _StepsBold!!
        }
        _StepsBold =
            ImageVector
                .Builder(
                    name = "Bold.StepsBold",
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
                        moveTo(16f, 200f)
                        lineToRelative(56f, 0f)
                        lineToRelative(0f, -48f)
                        lineToRelative(56f, 0f)
                        lineToRelative(0f, -48f)
                        lineToRelative(56f, 0f)
                        lineToRelative(0f, -48f)
                        lineToRelative(56f, 0f)
                    }
                }.build()

        return _StepsBold!!
    }

@Suppress("ObjectPropertyName")
private var _StepsBold: ImageVector? = null
