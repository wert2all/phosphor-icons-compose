package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.TagSimpleDuotone: ImageVector
    get() {
        if (_TagSimpleDuotone != null) {
            return _TagSimpleDuotone!!
        }
        _TagSimpleDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.TagSimpleDuotone",
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
                        moveTo(194.37f, 196.44f)
                        lineTo(240f, 128f)
                        lineTo(194.37f, 59.56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.72f, 56f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineTo(187.72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 194.37f, 196.44f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(194.37f, 196.44f)
                        lineTo(240f, 128f)
                        lineTo(194.37f, 59.56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.72f, 56f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineTo(187.72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 194.37f, 196.44f)
                        close()
                    }
                }.build()

        return _TagSimpleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TagSimpleDuotone: ImageVector? = null
