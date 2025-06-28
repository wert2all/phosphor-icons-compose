package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CheckCircleFill: ImageVector
    get() {
        if (_CheckCircleFill != null) {
            return _CheckCircleFill!!
        }
        _CheckCircleFill =
            ImageVector
                .Builder(
                    name = "CheckCircleFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(173.66f, 109.66f)
                        lineTo(117.66f, 165.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                        lineToRelative(-24f, -24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                        lineTo(112f, 148.69f)
                        lineToRelative(50.34f, -50.35f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                        close()
                    }
                }.build()

        return _CheckCircleFill!!
    }

@Suppress("ObjectPropertyName")
private var _CheckCircleFill: ImageVector? = null
