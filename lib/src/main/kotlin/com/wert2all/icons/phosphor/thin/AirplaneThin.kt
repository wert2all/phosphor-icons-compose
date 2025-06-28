package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.AirplaneThin: ImageVector
    get() {
        if (_AirplaneThin != null) {
            return _AirplaneThin!!
        }
        _AirplaneThin =
            ImageVector
                .Builder(
                    name = "AirplaneThin",
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
                        moveTo(152f, 96f)
                        lineToRelative(80f, 40f)
                        verticalLineToRelative(32f)
                        lineToRelative(-80f, -16f)
                        verticalLineToRelative(32f)
                        lineToRelative(16f, 16f)
                        verticalLineToRelative(32f)
                        lineToRelative(-40f, -16f)
                        lineTo(88f, 232f)
                        verticalLineTo(200f)
                        lineToRelative(16f, -16f)
                        verticalLineTo(152f)
                        lineTo(24f, 168f)
                        verticalLineTo(136f)
                        lineToRelative(80f, -40f)
                        verticalLineTo(48f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 0f)
                        close()
                    }
                }.build()

        return _AirplaneThin!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneThin: ImageVector? = null
