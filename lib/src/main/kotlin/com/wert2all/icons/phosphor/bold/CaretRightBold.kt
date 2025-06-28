package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.CaretRightBold: ImageVector
    get() {
        if (_CaretRightBold != null) {
            return _CaretRightBold!!
        }
        _CaretRightBold =
            ImageVector
                .Builder(
                    name = "CaretRightBold",
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
                        moveTo(96f, 48f)
                        lineToRelative(80f, 80f)
                        lineToRelative(-80f, 80f)
                    }
                }.build()

        return _CaretRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _CaretRightBold: ImageVector? = null
