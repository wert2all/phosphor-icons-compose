package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.IceCreamDuotone: ImageVector
    get() {
        if (_IceCreamDuotone != null) {
            return _IceCreamDuotone!!
        }
        _IceCreamDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.IceCreamDuotone",
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
                        moveTo(56f, 96f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 0f)
                        verticalLineToRelative(8f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
                        horizontalLineTo(56f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 96f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 0f)
                        verticalLineToRelative(8f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
                        horizontalLineTo(56f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(146.86f, 215f)
                        lineTo(101.71f, 136f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(165.71f, 182f)
                        lineTo(139.43f, 136f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192.07f, 136f)
                        lineTo(135f, 236f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.9f, 0f)
                        lineTo(63.93f, 136f)
                    }
                }.build()

        return _IceCreamDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _IceCreamDuotone: ImageVector? = null
