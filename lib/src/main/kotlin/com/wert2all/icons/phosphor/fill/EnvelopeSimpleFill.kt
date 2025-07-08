package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.EnvelopeSimpleFill: ImageVector
    get() {
        if (_EnvelopeSimpleFill != null) {
            return _EnvelopeSimpleFill!!
        }
        _EnvelopeSimpleFill =
            ImageVector
                .Builder(
                    name = "Fill.EnvelopeSimpleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(224f, 48f)
                        lineTo(32f, 48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        lineTo(24f, 192f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(216f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(232f, 56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 48f)
                        close()
                        moveTo(216f, 192f)
                        lineTo(40f, 192f)
                        lineTo(40f, 74.19f)
                        lineToRelative(82.59f, 75.71f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.82f, 0f)
                        lineTo(216f, 74.19f)
                        lineTo(216f, 192f)
                        close()
                    }
                }.build()

        return _EnvelopeSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeSimpleFill: ImageVector? = null
