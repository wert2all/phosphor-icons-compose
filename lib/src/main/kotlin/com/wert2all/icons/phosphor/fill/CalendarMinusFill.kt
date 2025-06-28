package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CalendarMinusFill: ImageVector
    get() {
        if (_CalendarMinusFill != null) {
            return _CalendarMinusFill!!
        }
        _CalendarMinusFill =
            ImageVector
                .Builder(
                    name = "CalendarMinusFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(208f, 32f)
                        lineTo(184f, 32f)
                        lineTo(184f, 24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                        verticalLineToRelative(8f)
                        lineTo(88f, 32f)
                        lineTo(88f, 24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                        verticalLineToRelative(8f)
                        lineTo(48f, 32f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                        lineTo(32f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(208f, 224f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(224f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                        close()
                        moveTo(152f, 160f)
                        lineTo(104f, 160f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        close()
                        moveTo(208f, 80f)
                        lineTo(48f, 80f)
                        lineTo(48f, 48f)
                        lineTo(72f, 48f)
                        verticalLineToRelative(8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(88f, 48f)
                        horizontalLineToRelative(80f)
                        verticalLineToRelative(8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        lineTo(184f, 48f)
                        horizontalLineToRelative(24f)
                        close()
                    }
                }.build()

        return _CalendarMinusFill!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarMinusFill: ImageVector? = null
