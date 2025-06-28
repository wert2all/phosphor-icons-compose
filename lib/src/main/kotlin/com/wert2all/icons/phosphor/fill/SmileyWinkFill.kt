package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.SmileyWinkFill: ImageVector
    get() {
        if (_SmileyWinkFill != null) {
            return _SmileyWinkFill!!
        }
        _SmileyWinkFill =
            ImageVector
                .Builder(
                    name = "SmileyWinkFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(92f, 96f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 96f)
                        close()
                        moveTo(174.92f, 156f)
                        curveToRelative(-10.29f, 17.79f, -27.39f, 28f, -46.92f, 28f)
                        reflectiveCurveToRelative(-36.63f, -10.2f, -46.92f, -28f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.84f, -8f)
                        curveToRelative(7.47f, 12.91f, 19.21f, 20f, 33.08f, 20f)
                        reflectiveCurveToRelative(25.61f, -7.1f, 33.08f, -20f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.84f, 8f)
                        close()
                        moveTo(184f, 116f)
                        lineTo(152f, 116f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        close()
                    }
                }.build()

        return _SmileyWinkFill!!
    }

@Suppress("ObjectPropertyName")
private var _SmileyWinkFill: ImageVector? = null
