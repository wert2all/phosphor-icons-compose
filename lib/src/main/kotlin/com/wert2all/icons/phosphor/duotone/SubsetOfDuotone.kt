package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.SubsetOfDuotone: ImageVector
    get() {
        if (_SubsetOfDuotone != null) {
            return _SubsetOfDuotone!!
        }
        _SubsetOfDuotone =
            ImageVector
                .Builder(
                    name = "SubsetOfDuotone",
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
                        moveTo(200f, 56f)
                        horizontalLineTo(104f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 112f)
                        horizontalLineToRelative(96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 208f)
                        lineTo(48f, 208f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 56f)
                        horizontalLineTo(104f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 112f)
                        horizontalLineToRelative(96f)
                    }
                }.build()

        return _SubsetOfDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SubsetOfDuotone: ImageVector? = null
