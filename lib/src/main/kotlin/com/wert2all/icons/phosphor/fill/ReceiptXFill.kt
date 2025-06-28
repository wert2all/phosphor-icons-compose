package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ReceiptXFill: ImageVector
    get() {
        if (_ReceiptXFill != null) {
            return _ReceiptXFill!!
        }
        _ReceiptXFill =
            ImageVector
                .Builder(
                    name = "ReceiptXFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(216f, 40f)
                        lineTo(40f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                        lineTo(24f, 208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.58f, 7.15f)
                        lineTo(64f, 200.94f)
                        lineToRelative(28.42f, 14.21f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, 0f)
                        lineTo(128f, 200.94f)
                        lineToRelative(28.42f, 14.21f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, 0f)
                        lineTo(192f, 200.94f)
                        lineToRelative(28.42f, 14.21f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 208f)
                        lineTo(232f, 56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                        close()
                        moveTo(157.66f, 138.34f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                        lineTo(128f, 131.31f)
                        lineToRelative(-18.34f, 18.35f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                        lineTo(116.69f, 120f)
                        lineTo(98.34f, 101.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                        lineTo(128f, 108.69f)
                        lineToRelative(18.34f, -18.35f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                        lineTo(139.31f, 120f)
                        close()
                    }
                }.build()

        return _ReceiptXFill!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptXFill: ImageVector? = null
