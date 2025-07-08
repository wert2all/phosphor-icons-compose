package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.TagChevronDuotone: ImageVector
    get() {
        if (_TagChevronDuotone != null) {
            return _TagChevronDuotone!!
        }
        _TagChevronDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.TagChevronDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(32f, 200f)
                        horizontalLineTo(187.72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.65f, -3.56f)
                        lineTo(240f, 128f)
                        lineTo(194.37f, 59.56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.72f, 56f)
                        horizontalLineTo(32f)
                        lineToRelative(48f, 72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 200f)
                        horizontalLineTo(187.72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.65f, -3.56f)
                        lineTo(240f, 128f)
                        lineTo(194.37f, 59.56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.72f, 56f)
                        horizontalLineTo(32f)
                        lineToRelative(48f, 72f)
                        close()
                    }
                }.build()

        return _TagChevronDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TagChevronDuotone: ImageVector? = null
