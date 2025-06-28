package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ShareNetworkFill: ImageVector
    get() {
        if (_ShareNetworkFill != null) {
            return _ShareNetworkFill!!
        }
        _ShareNetworkFill =
            ImageVector
                .Builder(
                    name = "ShareNetworkFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(212f, 200f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -69.85f, -12.25f)
                        lineToRelative(-53f, -34.05f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -51.4f)
                        lineToRelative(53f, -34f)
                        arcToRelative(36.09f, 36.09f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.67f, 13.45f)
                        lineToRelative(-53f, 34.05f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 24.5f)
                        lineToRelative(53f, 34.05f)
                        arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 212f, 200f)
                        close()
                    }
                }.build()

        return _ShareNetworkFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShareNetworkFill: ImageVector? = null
