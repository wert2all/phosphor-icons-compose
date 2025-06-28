package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.PersonSimpleTaiChiFill: ImageVector
    get() {
        if (_PersonSimpleTaiChiFill != null) {
            return _PersonSimpleTaiChiFill!!
        }
        _PersonSimpleTaiChiFill =
            ImageVector
                .Builder(
                    name = "PersonSimpleTaiChiFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(96f, 48f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 48f)
                        close()
                        moveTo(216f, 96f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                        horizontalLineToRelative(80f)
                        verticalLineToRelative(28.44f)
                        lineTo(42.65f, 210.05f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 53.35f, 222f)
                        lineToRelative(76.2f, -68.58f)
                        lineTo(176f, 173.28f)
                        verticalLineTo(216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                        verticalLineTo(168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.85f, -7.35f)
                        lineTo(136f, 138.72f)
                        verticalLineTo(112f)
                        horizontalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                        close()
                    }
                }.build()

        return _PersonSimpleTaiChiFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleTaiChiFill: ImageVector? = null
