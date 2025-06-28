package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.GoodreadsLogoFill: ImageVector
    get() {
        if (_GoodreadsLogoFill != null) {
            return _GoodreadsLogoFill!!
        }
        _GoodreadsLogoFill =
            ImageVector
                .Builder(
                    name = "GoodreadsLogoFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(200f, 24f)
                        lineTo(56f, 24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                        lineTo(40f, 216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(200f, 232f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(216f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                        close()
                        moveTo(176f, 160f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -86.4f, 28.8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.8f, -9.6f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 160f)
                        lineTo(160f, 147.74f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 112f)
                        verticalLineToRelative(-8f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, -35.74f)
                        lineTo(160f, 64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                        close()
                        moveTo(160f, 104f)
                        verticalLineToRelative(8f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                        verticalLineToRelative(-8f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                        close()
                    }
                }.build()

        return _GoodreadsLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _GoodreadsLogoFill: ImageVector? = null
