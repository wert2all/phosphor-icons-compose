package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.SoundcloudLogoFill: ImageVector
    get() {
        if (_SoundcloudLogoFill != null) {
            return _SoundcloudLogoFill!!
        }
        _SoundcloudLogoFill =
            ImageVector
                .Builder(
                    name = "SoundcloudLogoFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(24f, 120f)
                        verticalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        lineTo(8f, 120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                        moveTo(48f, 88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(56f, 96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 88f)
                        close()
                        moveTo(80f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        lineTo(72f, 192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(88f, 88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 80f)
                        close()
                        moveTo(112f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        lineTo(104f, 192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(120f, 56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 48f)
                        close()
                        moveTo(222.84f, 106.34f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 40f)
                        horizontalLineToRelative(-4f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                        lineTo(136f, 196f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                        horizontalLineToRelative(67.21f)
                        curveToRelative(25.58f, 0f, 47.27f, -19.72f, 48.71f, -45.26f)
                        arcTo(48.06f, 48.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 222.84f, 106.34f)
                        close()
                    }
                }.build()

        return _SoundcloudLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _SoundcloudLogoFill: ImageVector? = null
