package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.ShoppingCartSimple: ImageVector
    get() {
        if (_ShoppingCartSimple != null) {
            return _ShoppingCartSimple!!
        }
        _ShoppingCartSimple =
            ImageVector
                .Builder(
                    name = "ShoppingCartSimple",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(88f, 216f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(192f, 216f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 32f)
                        horizontalLineTo(40f)
                        lineTo(76.75f, 164.28f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92.16f, 176f)
                        horizontalLineTo(191f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.42f, -11.72f)
                        lineTo(232f, 72f)
                        horizontalLineTo(51.11f)
                    }
                }.build()

        return _ShoppingCartSimple!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCartSimple: ImageVector? = null
