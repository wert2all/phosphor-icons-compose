package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.SecurityCameraFill: ImageVector
    get() {
        if (_SecurityCameraFill != null) {
            return _SecurityCameraFill!!
        }
        _SecurityCameraFill =
            ImageVector
                .Builder(
                    name = "Fill.SecurityCameraFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(248f, 136f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(16f)
                        horizontalLineTo(195.31f)
                        lineTo(177f, 141.66f)
                        lineToRelative(50.34f, -50.35f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.62f)
                        lineTo(189.66f, 31f)
                        horizontalLineToRelative(0f)
                        lineTo(171.31f, 12.69f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 0f)
                        lineTo(2.92f, 158.94f)
                        arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 176f)
                        horizontalLineTo(49.37f)
                        lineToRelative(35.32f, 35.31f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, 0f)
                        lineTo(165.66f, 153f)
                        lineTo(184f, 171.31f)
                        arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 195.31f, 176f)
                        horizontalLineTo(240f)
                        verticalLineToRelative(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(144f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 136f)
                        close()
                        moveTo(160f, 24f)
                        lineToRelative(12.69f, 12.69f)
                        lineTo(49.37f, 160f)
                        horizontalLineTo(24.46f)
                        close()
                    }
                }.build()

        return _SecurityCameraFill!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityCameraFill: ImageVector? = null
