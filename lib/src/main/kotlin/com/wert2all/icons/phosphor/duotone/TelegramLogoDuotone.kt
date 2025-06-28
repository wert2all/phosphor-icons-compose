package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.TelegramLogoDuotone: ImageVector
    get() {
        if (_TelegramLogoDuotone != null) {
            return _TelegramLogoDuotone!!
        }
        _TelegramLogoDuotone =
            ImageVector
                .Builder(
                    name = "TelegramLogoDuotone",
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
                        moveTo(80f, 134.87f)
                        lineTo(223.41f, 32.09f)
                        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.78f, 0f)
                        lineTo(20f, 111.38f)
                        arcTo(6.23f, 6.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 123.3f)
                        lineToRelative(59f, 11.57f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(124.37f, 173.78f)
                        lineTo(93.76f, 205.54f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 200f)
                        verticalLineTo(134.87f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 134.87f)
                        lineTo(170.26f, 214f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.09f, -4.21f)
                        lineTo(224f, 33.22f)
                        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.34f, -1.15f)
                        lineTo(20f, 111.38f)
                        arcTo(6.23f, 6.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 123.3f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 134.87f)
                        lineTo(223.41f, 32.09f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(124.37f, 173.78f)
                        lineTo(93.76f, 205.54f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 200f)
                        verticalLineTo(134.87f)
                    }
                }.build()

        return _TelegramLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TelegramLogoDuotone: ImageVector? = null
