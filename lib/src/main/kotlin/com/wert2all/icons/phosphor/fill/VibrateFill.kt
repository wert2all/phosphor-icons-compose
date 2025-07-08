package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.VibrateFill: ImageVector
    get() {
        if (_VibrateFill != null) {
            return _VibrateFill!!
        }
        _VibrateFill =
            ImageVector
                .Builder(
                    name = "Fill.VibrateFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(96f, 32f)
                        lineTo(160f, 32f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 56f)
                        lineTo(184f, 200f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 224f)
                        lineTo(96f, 224f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 200f)
                        lineTo(72f, 56f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 32f)
                        close()
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(208f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 80f)
                        close()
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(240f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(104f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 96f)
                        close()
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(48f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 80f)
                        close()
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(16f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(104f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 96f)
                        close()
                    }
                }.build()

        return _VibrateFill!!
    }

@Suppress("ObjectPropertyName")
private var _VibrateFill: ImageVector? = null
