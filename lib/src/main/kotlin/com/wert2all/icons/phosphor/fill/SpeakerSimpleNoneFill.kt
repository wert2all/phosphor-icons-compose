package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.SpeakerSimpleNoneFill: ImageVector
    get() {
        if (_SpeakerSimpleNoneFill != null) {
            return _SpeakerSimpleNoneFill!!
        }
        _SpeakerSimpleNoneFill =
            ImageVector
                .Builder(
                    name = "SpeakerSimpleNoneFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(163.52f, 24.81f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.43f, 0.88f)
                        lineTo(85.25f, 80f)
                        horizontalLineTo(40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 96f)
                        verticalLineToRelative(64f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineTo(85.25f)
                        lineToRelative(69.84f, 54.31f)
                        arcTo(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 232f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        verticalLineTo(32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 163.52f, 24.81f)
                        close()
                    }
                }.build()

        return _SpeakerSimpleNoneFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerSimpleNoneFill: ImageVector? = null
