package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.PersonSimpleHikeFill: ImageVector
    get() {
        if (_PersonSimpleHikeFill != null) {
            return _PersonSimpleHikeFill!!
        }
        _PersonSimpleHikeFill =
            ImageVector
                .Builder(
                    name = "PersonSimpleHikeFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(120f, 48f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 48f)
                        close()
                        moveTo(192f, 136f)
                        curveToRelative(-23.37f, 0f, -28.92f, -8.56f, -36.6f, -20.4f)
                        curveToRelative(-3.65f, -5.64f, -7.79f, -12f, -14.16f, -17.55f)
                        arcToRelative(40.92f, 40.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -5.47f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11f, 3.92f)
                        lineTo(64.66f, 228.81f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.15f, 10.52f)
                        arcTo(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 240f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.34f, -4.81f)
                        lineToRelative(33.59f, -77.27f)
                        lineTo(144f, 180.12f)
                        lineTo(144f, 232f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(160f, 176f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.35f, -6.51f)
                        lineToRelative(-37.2f, -26.57f)
                        lineToRelative(13.4f, -30.81f)
                        curveToRelative(3.57f, 3.62f, 6.28f, 7.8f, 9.13f, 12.19f)
                        curveToRelative(7.67f, 11.84f, 16.27f, 25.11f, 42f, 27.36f)
                        lineTo(183.98f, 232f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(199.98f, 144f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 136f)
                        close()
                        moveTo(72f, 152f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.36f, -4.85f)
                        lineToRelative(24f, -56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.2f, -10.5f)
                        lineToRelative(-28f, -12f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.5f, 4.2f)
                        lineToRelative(-24f, 56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 10.5f)
                        lineToRelative(28f, 12f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 152f)
                        close()
                    }
                }.build()

        return _PersonSimpleHikeFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleHikeFill: ImageVector? = null
