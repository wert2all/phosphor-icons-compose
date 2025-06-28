package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.LetterCirclePFill: ImageVector
    get() {
        if (_LetterCirclePFill != null) {
            return _LetterCirclePFill!!
        }
        _LetterCirclePFill =
            ImageVector
                .Builder(
                    name = "LetterCirclePFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(156f, 116f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, 20f)
                        lineTo(112f, 136f)
                        lineTo(112f, 96f)
                        horizontalLineToRelative(24f)
                        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 116f)
                        close()
                        moveTo(232f, 128f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                        close()
                        moveTo(172f, 116f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -36f, -36f)
                        lineTo(104f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(112f, 152f)
                        horizontalLineToRelative(24f)
                        arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 172f, 116f)
                        close()
                    }
                }.build()

        return _LetterCirclePFill!!
    }

@Suppress("ObjectPropertyName")
private var _LetterCirclePFill: ImageVector? = null
