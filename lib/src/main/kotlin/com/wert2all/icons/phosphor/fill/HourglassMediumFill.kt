package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.HourglassMediumFill: ImageVector
    get() {
        if (_HourglassMediumFill != null) {
            return _HourglassMediumFill!!
        }
        _HourglassMediumFill =
            ImageVector
                .Builder(
                    name = "HourglassMediumFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(200f, 75.64f)
                        lineTo(200f, 40f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                        lineTo(72f, 24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                        lineTo(56f, 76f)
                        arcToRelative(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 12.8f)
                        lineTo(114.67f, 128f)
                        lineTo(62.4f, 167.2f)
                        arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 180f)
                        verticalLineToRelative(36f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(184f, 232f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(200f, 180.36f)
                        arcToRelative(
                            16.09f,
                            16.09f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = false,
                            -6.35f,
                            -12.77f,
                        )
                        lineTo(141.27f, 128f)
                        lineToRelative(52.38f, -39.59f)
                        arcTo(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 75.64f)
                        close()
                        moveTo(184f, 180.36f)
                        lineTo(184f, 216f)
                        lineTo(72f, 216f)
                        lineTo(72f, 180f)
                        lineToRelative(48f, -36f)
                        verticalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(136f, 144.08f)
                        close()
                        moveTo(184f, 75.64f)
                        lineTo(178.23f, 80f)
                        lineTo(77.33f, 80f)
                        lineTo(72f, 76f)
                        lineTo(72f, 40f)
                        lineTo(184f, 40f)
                        close()
                    }
                }.build()

        return _HourglassMediumFill!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassMediumFill: ImageVector? = null
