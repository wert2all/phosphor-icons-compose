package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.CaretUpThin: ImageVector
    get() {
        if (_CaretUpThin != null) {
            return _CaretUpThin!!
        }
        _CaretUpThin =
            ImageVector
                .Builder(
                    name = "CaretUpThin",
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
                        moveTo(48f, 160f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                    }
                }.build()

        return _CaretUpThin!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUpThin: ImageVector? = null
