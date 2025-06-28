package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.WebcamFill: ImageVector
    get() {
        if (_WebcamFill != null) {
            return _WebcamFill!!
        }
        _WebcamFill =
            ImageVector
                .Builder(
                    name = "WebcamFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(160f, 104f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, -32f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 104f)
                        close()
                        moveTo(232f, 208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        lineTo(32f, 216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(88f)
                        lineTo(120f, 183.6f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        lineTo(136f, 200f)
                        horizontalLineToRelative(88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 208f)
                        close()
                        moveTo(128f, 152f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -48f, -48f)
                        arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 152f)
                        close()
                    }
                }.build()

        return _WebcamFill!!
    }

@Suppress("ObjectPropertyName")
private var _WebcamFill: ImageVector? = null
