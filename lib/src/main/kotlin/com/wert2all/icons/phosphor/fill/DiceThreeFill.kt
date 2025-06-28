package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.DiceThreeFill: ImageVector
    get() {
        if (_DiceThreeFill != null) {
            return _DiceThreeFill!!
        }
        _DiceThreeFill =
            ImageVector
                .Builder(
                    name = "DiceThreeFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(192f, 32f)
                        lineTo(64f, 32f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 64f)
                        lineTo(32f, 192f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                        lineTo(192f, 224f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                        lineTo(224f, 64f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 32f)
                        close()
                        moveTo(92f, 104f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 104f)
                        close()
                        moveTo(128f, 140f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 140f)
                        close()
                        moveTo(164f, 176f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 176f)
                        close()
                    }
                }.build()

        return _DiceThreeFill!!
    }

@Suppress("ObjectPropertyName")
private var _DiceThreeFill: ImageVector? = null
