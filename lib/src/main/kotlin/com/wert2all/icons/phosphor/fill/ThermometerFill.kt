package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ThermometerFill: ImageVector
    get() {
        if (_ThermometerFill != null) {
            return _ThermometerFill!!
        }
        _ThermometerFill =
            ImageVector
                .Builder(
                    name = "ThermometerFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(212f, 56f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 28f, 28f)
                        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212f, 56f)
                        close()
                        moveTo(212f, 96f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 212f, 96f)
                        close()
                        moveTo(152f, 146.08f)
                        lineTo(152f, 40f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 0f)
                        lineTo(88f, 146.08f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                        close()
                        moveTo(136f, 104f)
                        lineTo(104f, 104f)
                        lineTo(104f, 40f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                        close()
                    }
                }.build()

        return _ThermometerFill!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerFill: ImageVector? = null
