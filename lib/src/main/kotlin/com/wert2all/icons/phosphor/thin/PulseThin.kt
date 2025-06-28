package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.PulseThin: ImageVector
    get() {
        if (_PulseThin != null) {
            return _PulseThin!!
        }
        _PulseThin =
            ImageVector
                .Builder(
                    name = "PulseThin",
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
                        moveTo(24f, 128f)
                        lineToRelative(32f, 0f)
                        lineToRelative(40f, -88f)
                        lineToRelative(64f, 168f)
                        lineToRelative(40f, -80f)
                        lineToRelative(32f, 0f)
                    }
                }.build()

        return _PulseThin!!
    }

@Suppress("ObjectPropertyName")
private var _PulseThin: ImageVector? = null
