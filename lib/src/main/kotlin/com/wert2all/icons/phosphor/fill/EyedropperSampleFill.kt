package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.EyedropperSampleFill: ImageVector
    get() {
        if (_EyedropperSampleFill != null) {
            return _EyedropperSampleFill!!
        }
        _EyedropperSampleFill =
            ImageVector
                .Builder(
                    name = "EyedropperSampleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(224f, 67.3f)
                        arcToRelative(
                            35.79f,
                            35.79f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = false,
                            -11.26f,
                            -25.66f,
                        )
                        curveToRelative(-14f, -13.28f, -36.72f, -12.78f, -50.62f, 1.13f)
                        lineTo(138.8f, 66.2f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -33.14f, 0.77f)
                        lineToRelative(-5f, 5f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.64f)
                        lineToRelative(2f, 2.06f)
                        lineToRelative(-51f, 51f)
                        arcToRelative(39.75f, 39.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.53f, 38f)
                        lineToRelative(-8f, 18.41f)
                        arcTo(13.65f, 13.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 219.29f)
                        arcToRelative(15.9f, 15.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.71f, 3.36f)
                        lineTo(71.24f, 215f)
                        arcToRelative(39.9f, 39.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 37.05f, -10.75f)
                        lineToRelative(51f, -51f)
                        lineToRelative(2.06f, 2.06f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, 0f)
                        lineToRelative(5f, -5f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.74f, -33.18f)
                        lineToRelative(23.75f, -23.87f)
                        arcTo(35.75f, 35.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 67.3f)
                        close()
                        moveTo(138f, 152f)
                        horizontalLineTo(70.07f)
                        lineToRelative(44f, -44f)
                        lineToRelative(33.94f, 34f)
                        close()
                    }
                }.build()

        return _EyedropperSampleFill!!
    }

@Suppress("ObjectPropertyName")
private var _EyedropperSampleFill: ImageVector? = null
