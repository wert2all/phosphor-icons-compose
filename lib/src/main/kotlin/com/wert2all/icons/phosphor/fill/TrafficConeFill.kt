package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.TrafficConeFill: ImageVector
    get() {
        if (_TrafficConeFill != null) {
            return _TrafficConeFill!!
        }
        _TrafficConeFill =
            ImageVector
                .Builder(
                    name = "Fill.TrafficConeFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(232f, 208f)
                        horizontalLineTo(213.69f)
                        lineTo(153.42f, 34.75f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 138.31f, 24f)
                        horizontalLineTo(117.69f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.11f, 10.74f)
                        lineTo(42.31f, 208f)
                        horizontalLineTo(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineTo(232f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                        close()
                        moveTo(95.43f, 104f)
                        horizontalLineToRelative(65.14f)
                        lineToRelative(16.7f, 48f)
                        horizontalLineTo(78.73f)
                        close()
                    }
                }.build()

        return _TrafficConeFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrafficConeFill: ImageVector? = null
