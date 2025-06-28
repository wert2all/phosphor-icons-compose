package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.DiceTwoFill: ImageVector
    get() {
        if (_DiceTwoFill != null) {
            return _DiceTwoFill!!
        }
        _DiceTwoFill =
            ImageVector
                .Builder(
                    name = "DiceTwoFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(192f, 32f)
                        lineTo(64f, 32f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 64f)
                        lineTo(32f, 192f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                        lineTo(192f, 224f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                        lineTo(224f, 64f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 32f)
                        close()
                        moveTo(108f, 120f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, 120f)
                        close()
                        moveTo(148f, 160f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 160f)
                        close()
                    }
                }.build()

        return _DiceTwoFill!!
    }

@Suppress("ObjectPropertyName")
private var _DiceTwoFill: ImageVector? = null
