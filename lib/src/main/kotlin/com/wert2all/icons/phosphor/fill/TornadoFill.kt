package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.TornadoFill: ImageVector
    get() {
        if (_TornadoFill != null) {
            return _TornadoFill!!
        }
        _TornadoFill =
            ImageVector
                .Builder(
                    name = "Fill.TornadoFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(144f, 228f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 12f)
                        horizontalLineTo(116f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -24f)
                        horizontalLineToRelative(16f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 228f)
                        close()
                        moveTo(220f, 32f)
                        horizontalLineTo(60f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 24f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 24f)
                        horizontalLineTo(44f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 24f)
                        horizontalLineTo(76f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 24f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 24f)
                        horizontalLineToRelative(48f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 24f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 24f)
                        horizontalLineToRelative(48f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -24f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -24f)
                        horizontalLineToRelative(16f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -24f)
                        horizontalLineTo(164f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -24f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -24f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -24f)
                        horizontalLineToRelative(56f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -24f)
                        close()
                    }
                }.build()

        return _TornadoFill!!
    }

@Suppress("ObjectPropertyName")
private var _TornadoFill: ImageVector? = null
