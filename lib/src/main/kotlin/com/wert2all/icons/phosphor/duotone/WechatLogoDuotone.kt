package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.WechatLogoDuotone: ImageVector
    get() {
        if (_WechatLogoDuotone != null) {
            return _WechatLogoDuotone!!
        }
        _WechatLogoDuotone =
            ImageVector
                .Builder(
                    name = "WechatLogoDuotone",
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
                        moveTo(88f, 152f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, -72f)
                        curveToRelative(1.32f, 0f, 2.63f, 0f, 3.94f, 0.11f)
                        horizontalLineToRelative(0f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32.5f, 138f)
                        lineToRelative(-8.16f, 27.76f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.93f, 9.93f)
                        lineTo(62f, 167.5f)
                        arcToRelative(71.53f, 71.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 30f, 8.39f)
                        horizontalLineToRelative(0f)
                        arcTo(71.83f, 71.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 152f)
                        close()
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(132f, 140f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(188f, 140f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 224f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 63.5f, -38f)
                        lineToRelative(8.16f, 27.76f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.93f, 9.93f)
                        lineTo(194f, 215.5f)
                        arcTo(71.75f, 71.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 224f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(92.06f, 175.89f)
                        arcToRelative(71.53f, 71.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -30f, -8.39f)
                        lineToRelative(-27.76f, 8.16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.93f, -9.93f)
                        lineTo(32.5f, 138f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 163.94f, 80.11f)
                    }
                }.build()

        return _WechatLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WechatLogoDuotone: ImageVector? = null
