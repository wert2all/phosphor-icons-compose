package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArrowFatLinesRightFill: ImageVector
    get() {
        if (_ArrowFatLinesRightFill != null) {
            return _ArrowFatLinesRightFill!!
        }
        _ArrowFatLinesRightFill =
            ImageVector
                .Builder(
                    name = "ArrowFatLinesRightFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(132.94f, 231.39f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 224f)
                        lineTo(128f, 184f)
                        lineTo(104f, 184f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        lineTo(96f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(24f)
                        lineTo(128f, 32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                        lineToRelative(96f, 96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                        lineToRelative(-96f, 96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132.94f, 231.39f)
                        close()
                        moveTo(48f, 176f)
                        lineTo(48f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                        verticalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        close()
                        moveTo(80f, 176f)
                        lineTo(80f, 80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                        verticalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        close()
                    }
                }.build()

        return _ArrowFatLinesRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesRightFill: ImageVector? = null
