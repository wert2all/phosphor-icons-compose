package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.PhoneDisconnectDuotone: ImageVector
    get() {
        if (_PhoneDisconnectDuotone != null) {
            return _PhoneDisconnectDuotone!!
        }
        _PhoneDisconnectDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.PhoneDisconnectDuotone",
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
                        moveTo(225.94f, 95.83f)
                        curveToRelative(17.29f, 17.29f, 18.63f, 42.29f, 4f, 61.12f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.26f, 2.47f)
                        lineTo(171.58f, 142f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.86f, -5.8f)
                        lineToRelative(-6.21f, -29.74f)
                        arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.14f, -5.9f)
                        arcToRelative(84.39f, 84.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -55.1f, 0.13f)
                        arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.12f, 6f)
                        lineToRelative(-5.9f, 29.51f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84.38f, 142f)
                        lineTo(35.29f, 159.42f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, 157f)
                        curveToRelative(-14.6f, -18.83f, -13.26f, -43.83f, 4f, -61.12f)
                        curveTo(83.17f, 42.72f, 172.83f, 42.72f, 225.94f, 95.83f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(225.94f, 95.83f)
                        curveToRelative(17.29f, 17.29f, 18.63f, 42.29f, 4f, 61.12f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.26f, 2.47f)
                        lineTo(171.58f, 142f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.86f, -5.8f)
                        lineToRelative(-6.21f, -29.74f)
                        arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.14f, -5.9f)
                        arcToRelative(84.39f, 84.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -55.1f, 0.13f)
                        arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.12f, 6f)
                        lineToRelative(-5.9f, 29.51f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84.38f, 142f)
                        lineTo(35.29f, 159.42f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, 157f)
                        curveToRelative(-14.6f, -18.83f, -13.26f, -43.83f, 4f, -61.12f)
                        curveTo(83.17f, 42.72f, 172.83f, 42.72f, 225.94f, 95.83f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 200f)
                        lineTo(216f, 200f)
                    }
                }.build()

        return _PhoneDisconnectDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneDisconnectDuotone: ImageVector? = null
