package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ToiletFill: ImageVector
    get() {
        if (_ToiletFill != null) {
            return _ToiletFill!!
        }
        _ToiletFill =
            ImageVector
                .Builder(
                    name = "ToiletFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(60f, 88f)
                        lineTo(196f, 88f)
                        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                        lineTo(200f, 40f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                        lineTo(72f, 24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                        lineTo(56f, 84f)
                        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 60f, 88f)
                        close()
                        moveTo(88f, 48f)
                        horizontalLineToRelative(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        lineTo(88f, 64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        close()
                        moveTo(224f, 112f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        lineTo(40f, 104f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        arcToRelative(96.09f, 96.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 51.68f, 85.14f)
                        lineToRelative(-3.52f, 24.6f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 240f)
                        horizontalLineToRelative(64f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.84f, -18.26f)
                        lineToRelative(-3.52f, -24.6f)
                        arcTo(96.09f, 96.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 112f)
                        close()
                        moveTo(96f, 224f)
                        lineToRelative(2.93f, -20.5f)
                        arcToRelative(96.15f, 96.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 58.14f, 0f)
                        lineTo(160f, 224f)
                        close()
                    }
                }.build()

        return _ToiletFill!!
    }

@Suppress("ObjectPropertyName")
private var _ToiletFill: ImageVector? = null
