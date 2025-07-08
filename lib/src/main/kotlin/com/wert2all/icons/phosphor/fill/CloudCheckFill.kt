package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.CloudCheckFill: ImageVector
    get() {
        if (_CloudCheckFill != null) {
            return _CloudCheckFill!!
        }
        _CloudCheckFill =
            ImageVector
                .Builder(
                    name = "Fill.CloudCheckFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(247.93f, 124.52f)
                        curveTo(246.11f, 77.54f, 207.07f, 40f, 160.06f, 40f)
                        arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 81.29f, 88.67f)
                        horizontalLineToRelative(0f)
                        arcTo(87.48f, 87.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 127.73f)
                        arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.57f, 136f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 128f)
                        arcToRelative(
                            103.66f,
                            103.66f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = true,
                            5.34f,
                            -32.92f,
                        )
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.75f, -5.18f)
                        arcTo(64.09f, 64.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 152f)
                        curveToRelative(0f, 35.19f, 29.75f, 64f, 65f, 64f)
                        lineTo(160f, 216f)
                        arcTo(88.09f, 88.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 247.93f, 124.52f)
                        close()
                        moveTo(197.66f, 117.66f)
                        lineTo(149.66f, 165.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-24f, -24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                        lineTo(144f, 148.69f)
                        lineToRelative(42.34f, -42.35f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                        close()
                    }
                }.build()

        return _CloudCheckFill!!
    }

@Suppress("ObjectPropertyName")
private var _CloudCheckFill: ImageVector? = null
