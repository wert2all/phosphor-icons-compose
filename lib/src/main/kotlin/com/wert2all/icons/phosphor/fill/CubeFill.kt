package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.CubeFill: ImageVector
    get() {
        if (_CubeFill != null) {
            return _CubeFill!!
        }
        _CubeFill =
            ImageVector
                .Builder(
                    name = "Fill.CubeFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(223.68f, 66.15f)
                        lineTo(135.68f, 18f)
                        arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.36f, 0f)
                        lineToRelative(-88f, 48.17f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.32f, 14f)
                        verticalLineToRelative(95.64f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.32f, 14f)
                        lineToRelative(88f, 48.17f)
                        arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.36f, 0f)
                        lineToRelative(88f, -48.17f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.32f, -14f)
                        lineTo(232f, 80.18f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 223.68f, 66.15f)
                        close()
                        moveTo(128f, 120f)
                        lineTo(47.65f, 76f)
                        lineTo(128f, 32f)
                        lineToRelative(80.35f, 44f)
                        close()
                        moveTo(136f, 219.64f)
                        lineTo(136f, 133.83f)
                        lineToRelative(80f, -43.78f)
                        verticalLineToRelative(85.76f)
                        close()
                    }
                }.build()

        return _CubeFill!!
    }

@Suppress("ObjectPropertyName")
private var _CubeFill: ImageVector? = null
