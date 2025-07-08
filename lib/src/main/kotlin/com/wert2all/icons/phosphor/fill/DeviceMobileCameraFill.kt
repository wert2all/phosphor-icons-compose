package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.DeviceMobileCameraFill: ImageVector
    get() {
        if (_DeviceMobileCameraFill != null) {
            return _DeviceMobileCameraFill!!
        }
        _DeviceMobileCameraFill =
            ImageVector
                .Builder(
                    name = "Fill.DeviceMobileCameraFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(176f, 16f)
                        horizontalLineTo(80f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                        verticalLineTo(216f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                        horizontalLineToRelative(96f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                        verticalLineTo(40f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 16f)
                        close()
                        moveTo(128f, 72f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 72f)
                        close()
                    }
                }.build()

        return _DeviceMobileCameraFill!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMobileCameraFill: ImageVector? = null
