package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.WhatsappLogo: ImageVector
    get() {
        if (_WhatsappLogo != null) {
            return _WhatsappLogo!!
        }
        _WhatsappLogo =
            ImageVector
                .Builder(
                    name = "Regular.WhatsappLogo",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 104f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                        lineToRelative(16f, 32f)
                        lineToRelative(-12.32f, 18.47f)
                        arcToRelative(48.19f, 48.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.85f, 25.85f)
                        lineTo(152f, 136f)
                        lineToRelative(32f, 16f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 104f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(79.93f, 211.11f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -35f, -35f)
                        horizontalLineToRelative(0f)
                        lineTo(32.42f, 213.46f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.12f, 10.12f)
                        lineToRelative(37.39f, -12.47f)
                        close()
                    }
                }.build()

        return _WhatsappLogo!!
    }

@Suppress("ObjectPropertyName")
private var _WhatsappLogo: ImageVector? = null
