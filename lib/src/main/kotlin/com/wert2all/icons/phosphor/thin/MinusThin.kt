package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.MinusThin: ImageVector
    get() {
        if (_MinusThin != null) {
            return _MinusThin!!
        }
        _MinusThin =
            ImageVector
                .Builder(
                    name = "MinusThin",
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
                        moveTo(40f, 128f)
                        lineTo(216f, 128f)
                    }
                }.build()

        return _MinusThin!!
    }

@Suppress("ObjectPropertyName")
private var _MinusThin: ImageVector? = null
