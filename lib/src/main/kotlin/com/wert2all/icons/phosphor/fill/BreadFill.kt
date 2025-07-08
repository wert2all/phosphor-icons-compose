package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.BreadFill: ImageVector
    get() {
        if (_BreadFill != null) {
            return _BreadFill!!
        }
        _BreadFill =
            ImageVector
                .Builder(
                    name = "Fill.BreadFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(200f, 40f)
                        lineTo(48f, 40f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 76.65f)
                        lineTo(32f, 200f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(200f, 216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(216f, 116.65f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 40f)
                        close()
                        moveTo(144f, 104f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        verticalLineToRelative(80f)
                        lineTo(48f, 200f)
                        lineTo(48f, 120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -48f)
                        horizontalLineToRelative(96f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                        close()
                    }
                }.build()

        return _BreadFill!!
    }

@Suppress("ObjectPropertyName")
private var _BreadFill: ImageVector? = null
