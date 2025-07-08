package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.TidalLogoFill: ImageVector
    get() {
        if (_TidalLogoFill != null) {
            return _TidalLogoFill!!
        }
        _TidalLogoFill =
            ImageVector
                .Builder(
                    name = "Fill.TidalLogoFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(253.66f, 101.66f)
                        lineToRelative(-36f, 36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-36f, -36f)
                        lineToRelative(-0.34f, -0.38f)
                        lineToRelative(-0.34f, 0.38f)
                        lineTo(135.31f, 136f)
                        lineToRelative(34.35f, 34.34f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                        lineToRelative(-36f, 36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-36f, -36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                        lineTo(120.69f, 136f)
                        lineTo(86.34f, 101.66f)
                        lineToRelative(-0.34f, -0.38f)
                        lineToRelative(-0.34f, 0.38f)
                        lineToRelative(-36f, 36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-36f, -36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                        lineToRelative(36f, -36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                        lineToRelative(36f, 36f)
                        lineToRelative(0.34f, 0.38f)
                        lineToRelative(0.34f, -0.38f)
                        lineToRelative(36f, -36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                        lineToRelative(36f, 36f)
                        lineToRelative(0.34f, 0.38f)
                        lineToRelative(0.34f, -0.38f)
                        lineToRelative(36f, -36f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                        lineToRelative(36f, 36f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 253.66f, 101.66f)
                        close()
                    }
                }.build()

        return _TidalLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _TidalLogoFill: ImageVector? = null
