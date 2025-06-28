package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.HandEyeFill: ImageVector
    get() {
        if (_HandEyeFill != null) {
            return _HandEyeFill!!
        }
        _HandEyeFill =
            ImageVector
                .Builder(
                    name = "HandEyeFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(144f, 180f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, -16f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 180f)
                        close()
                        moveTo(216f, 104f)
                        verticalLineToRelative(48f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -176f, 0f)
                        lineTo(40f, 64f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                        verticalLineToRelative(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(88f, 32f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                        verticalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(136f, 48f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                        verticalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(184f, 104f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                        close()
                        moveTo(179.58f, 178.21f)
                        curveToRelative(-0.7f, -1.4f, -17.5f, -34.21f, -51.58f, -34.21f)
                        reflectiveCurveToRelative(-50.88f, 32.81f, -51.58f, 34.21f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.58f)
                        curveToRelative(0.7f, 1.4f, 17.5f, 34.21f, 51.58f, 34.21f)
                        reflectiveCurveToRelative(50.88f, -32.81f, 51.58f, -34.21f)
                        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 179.58f, 178.21f)
                        close()
                    }
                }.build()

        return _HandEyeFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandEyeFill: ImageVector? = null
