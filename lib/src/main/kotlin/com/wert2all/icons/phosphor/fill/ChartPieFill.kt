package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ChartPieFill: ImageVector
    get() {
        if (_ChartPieFill != null) {
            return _ChartPieFill!!
        }
        _ChartPieFill =
            ImageVector
                .Builder(
                    name = "Fill.ChartPieFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(128f, 40f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71.87f, 37.27f)
                        lineTo(128f, 118.76f)
                        close()
                        moveTo(128f, 216f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -71.87f, -37.27f)
                        lineTo(207.89f, 91.12f)
                        arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 216f)
                        close()
                    }
                }.build()

        return _ChartPieFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieFill: ImageVector? = null
