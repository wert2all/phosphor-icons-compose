package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.SupersetOfDuotone: ImageVector
    get() {
        if (_SupersetOfDuotone != null) {
            return _SupersetOfDuotone!!
        }
        _SupersetOfDuotone =
            ImageVector
                .Builder(
                    name = "SupersetOfDuotone",
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
                        moveTo(56f, 48f)
                        horizontalLineToRelative(96f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 112f)
                        horizontalLineTo(56f)
                        close()
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
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 48f)
                        horizontalLineToRelative(96f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 112f)
                        horizontalLineTo(56f)
                    }
                }.build()

        return _SupersetOfDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SupersetOfDuotone: ImageVector? = null
