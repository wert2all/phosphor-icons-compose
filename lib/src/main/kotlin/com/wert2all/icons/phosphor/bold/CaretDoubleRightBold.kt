package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.CaretDoubleRightBold: ImageVector
    get() {
        if (_CaretDoubleRightBold != null) {
            return _CaretDoubleRightBold!!
        }
        _CaretDoubleRightBold =
            ImageVector
                .Builder(
                    name = "CaretDoubleRightBold",
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
                        moveTo(56f, 48f)
                        lineToRelative(80f, 80f)
                        lineToRelative(-80f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 48f)
                        lineToRelative(80f, 80f)
                        lineToRelative(-80f, 80f)
                    }
                }.build()

        return _CaretDoubleRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleRightBold: ImageVector? = null
