package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.StepsDuotone: ImageVector
    get() {
        if (_StepsDuotone != null) {
            return _StepsDuotone!!
        }
        _StepsDuotone =
            ImageVector
                .Builder(
                    name = "StepsDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(224f, 200f)
                        horizontalLineTo(72f)
                        verticalLineTo(152f)
                        horizontalLineToRelative(56f)
                        verticalLineTo(104f)
                        horizontalLineToRelative(56f)
                        verticalLineTo(56f)
                        horizontalLineToRelative(56f)
                        verticalLineTo(184f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 200f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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

        return _StepsDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StepsDuotone: ImageVector? = null
