package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CellSignalNoneFill: ImageVector
    get() {
        if (_CellSignalNoneFill != null) {
            return _CellSignalNoneFill!!
        }
        _CellSignalNoneFill =
            ImageVector
                .Builder(
                    name = "CellSignalNoneFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(198.12f, 25.23f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17.44f, 3.46f)
                        lineToRelative(-160f, 160f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 216f)
                        horizontalLineTo(192f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        verticalLineTo(40f)
                        arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 198.12f, 25.23f)
                        close()
                        moveTo(192f, 200f)
                        horizontalLineTo(32f)
                        lineTo(192f, 40f)
                        close()
                    }
                }.build()

        return _CellSignalNoneFill!!
    }

@Suppress("ObjectPropertyName")
private var _CellSignalNoneFill: ImageVector? = null
