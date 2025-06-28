package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.WechatLogoFill: ImageVector
    get() {
        if (_WechatLogoFill != null) {
            return _WechatLogoFill!!
        }
        _WechatLogoFill =
            ImageVector
                .Builder(
                    name = "WechatLogoFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(232.07f, 186.76f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 169.58f, 72.59f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 23.93f, 138.76f)
                        lineToRelative(-7.27f, 24.71f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.87f, 19.87f)
                        lineToRelative(24.71f, -7.27f)
                        arcToRelative(79f, 79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.19f, 7.35f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 108.33f, 40.65f)
                        lineToRelative(24.71f, 7.27f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.87f, -19.87f)
                        close()
                        moveTo(132f, 152f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 152f)
                        close()
                        moveTo(80f, 152f)
                        arcToRelative(80.32f, 80.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.3f, 14.3f)
                        arcToRelative(63.45f, 63.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.49f, -5.85f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -0.63f)
                        lineTo(32f, 168f)
                        lineToRelative(8.17f, -27.76f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.63f, -6f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 151.68f, 72.43f)
                        arcTo(80.12f, 80.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 152f)
                        close()
                        moveTo(188f, 152f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188f, 152f)
                        close()
                    }
                }.build()

        return _WechatLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _WechatLogoFill: ImageVector? = null
