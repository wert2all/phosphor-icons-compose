package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.CopyleftFill: ImageVector
    get() {
        if (_CopyleftFill != null) {
            return _CopyleftFill!!
        }
        _CopyleftFill =
            ImageVector
                .Builder(
                    name = "Fill.CopyleftFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 56f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 72f, 72f)
                        arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 56f)
                        close()
                        moveTo(128f, 176f)
                        arcToRelative(47.66f, 47.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -38.4f, -19.19f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.8f, -9.61f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -38.4f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.8f, -9.61f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 176f)
                        close()
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(128f, 216f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 88f, -88f)
                        arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 216f)
                        close()
                    }
                }.build()

        return _CopyleftFill!!
    }

@Suppress("ObjectPropertyName")
private var _CopyleftFill: ImageVector? = null
