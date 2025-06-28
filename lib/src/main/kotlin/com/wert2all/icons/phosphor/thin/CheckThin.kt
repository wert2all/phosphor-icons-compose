package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.CheckThin: ImageVector
    get() {
        if (_CheckThin != null) {
            return _CheckThin!!
        }
        _CheckThin =
            ImageVector
                .Builder(
                    name = "CheckThin",
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
                        moveTo(40f, 144f)
                        lineToRelative(56f, 56f)
                        lineToRelative(128f, -128f)
                    }
                }.build()

        return _CheckThin!!
    }

@Suppress("ObjectPropertyName")
private var _CheckThin: ImageVector? = null
