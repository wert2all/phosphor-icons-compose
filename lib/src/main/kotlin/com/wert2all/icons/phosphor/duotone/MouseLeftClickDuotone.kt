package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.MouseLeftClickDuotone: ImageVector
    get() {
        if (_MouseLeftClickDuotone != null) {
            return _MouseLeftClickDuotone!!
        }
        _MouseLeftClickDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.MouseLeftClickDuotone",
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
                        moveTo(128f, 112f)
                        verticalLineTo(24f)
                        horizontalLineTo(112f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 80f)
                        verticalLineToRelative(32f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 24f)
                        lineTo(144f, 24f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 80f)
                        lineTo(200f, 176f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 232f)
                        lineTo(112f, 232f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 176f)
                        lineTo(56f, 80f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 24f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 112f)
                        lineTo(128f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 112f)
                        lineTo(200f, 112f)
                    }
                }.build()

        return _MouseLeftClickDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MouseLeftClickDuotone: ImageVector? = null
