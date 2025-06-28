package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.AngularLogoFill: ImageVector
    get() {
        if (_AngularLogoFill != null) {
            return _AngularLogoFill!!
        }
        _AngularLogoFill =
            ImageVector
                .Builder(
                    name = "AngularLogoFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 104.47f)
                        lineTo(141.07f, 128f)
                        horizontalLineTo(114.93f)
                        close()
                        moveTo(231.93f, 73.06f)
                        lineToRelative(-16f, 120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.35f, 6.1f)
                        lineToRelative(-80f, 40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, 0f)
                        lineToRelative(-80f, -40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.35f, -6.1f)
                        lineToRelative(-16f, -120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.85f, -8.44f)
                        lineToRelative(96f, -40f)
                        arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.16f, 0f)
                        lineToRelative(96f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.93f, 73.06f)
                        close()
                        moveTo(175f, 156.12f)
                        lineToRelative(-40f, -72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14f, 0f)
                        lineToRelative(-40f, 72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 7.76f)
                        lineTo(106f, 144f)
                        horizontalLineTo(150f)
                        lineToRelative(11f, 19.88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, -7.76f)
                        close()
                    }
                }.build()

        return _AngularLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _AngularLogoFill: ImageVector? = null
