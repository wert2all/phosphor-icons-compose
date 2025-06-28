package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.UserPlusFill: ImageVector
    get() {
        if (_UserPlusFill != null) {
            return _UserPlusFill!!
        }
        _UserPlusFill =
            ImageVector
                .Builder(
                    name = "UserPlusFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(256f, 136f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(232f)
                        verticalLineToRelative(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        verticalLineTo(144f)
                        horizontalLineTo(200f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(112f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(16f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 136f)
                        close()
                        moveTo(144f, 157.68f)
                        arcToRelative(68f, 68f, 0f, isMoreThanHalf = true, isPositiveArc = false, -71.9f, 0f)
                        curveToRelative(-20.65f, 6.76f, -39.23f, 19.39f, -54.17f, 37.17f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 208f)
                        horizontalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.13f, -13.15f)
                        curveTo(183.18f, 177.07f, 164.6f, 164.44f, 144f, 157.68f)
                        close()
                    }
                }.build()

        return _UserPlusFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserPlusFill: ImageVector? = null
