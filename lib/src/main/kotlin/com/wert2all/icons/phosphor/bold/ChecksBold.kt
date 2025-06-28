package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ChecksBold: ImageVector
    get() {
        if (_ChecksBold != null) {
            return _ChecksBold!!
        }
        _ChecksBold =
            ImageVector
                .Builder(
                    name = "ChecksBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 130.29f)
                        lineToRelative(38.4f, 37.71f)
                        lineToRelative(89.6f, -88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(134.11f, 152f)
                        lineToRelative(16.29f, 16f)
                        lineToRelative(89.6f, -88f)
                    }
                }.build()

        return _ChecksBold!!
    }

@Suppress("ObjectPropertyName")
private var _ChecksBold: ImageVector? = null
