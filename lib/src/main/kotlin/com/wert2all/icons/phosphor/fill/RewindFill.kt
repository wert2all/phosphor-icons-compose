package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.RewindFill: ImageVector
    get() {
        if (_RewindFill != null) {
            return _RewindFill!!
        }
        _RewindFill =
            ImageVector
                .Builder(
                    name = "Fill.RewindFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(232f, 71.84f)
                        verticalLineTo(184.16f)
                        arcToRelative(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.48f, 13.34f)
                        lineTo(128f, 146.86f)
                        verticalLineToRelative(37.3f)
                        arcToRelative(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.48f, 13.34f)
                        lineTo(15.33f, 141.34f)
                        arcToRelative(15.8f, 15.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -26.68f)
                        lineTo(103.52f, 58.5f)
                        arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 71.84f)
                        verticalLineToRelative(37.3f)
                        lineTo(207.52f, 58.5f)
                        arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 71.84f)
                        close()
                    }
                }.build()

        return _RewindFill!!
    }

@Suppress("ObjectPropertyName")
private var _RewindFill: ImageVector? = null
