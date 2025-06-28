package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.CaretLeftThin: ImageVector
    get() {
        if (_CaretLeftThin != null) {
            return _CaretLeftThin!!
        }
        _CaretLeftThin =
            ImageVector
                .Builder(
                    name = "CaretLeftThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 208f)
                        lineToRelative(-80f, -80f)
                        lineToRelative(80f, -80f)
                    }
                }.build()

        return _CaretLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLeftThin: ImageVector? = null
