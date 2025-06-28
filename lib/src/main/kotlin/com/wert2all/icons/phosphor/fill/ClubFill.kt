package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ClubFill: ImageVector
    get() {
        if (_ClubFill != null) {
            return _ClubFill!!
        }
        _ClubFill =
            ImageVector
                .Builder(
                    name = "ClubFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(240f, 144f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -84.81f, 48f)
                        horizontalLineToRelative(-4.44f)
                        lineToRelative(8.91f, 29.7f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 232f)
                        horizontalLineTo(104f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.66f, -10.3f)
                        lineToRelative(8.91f, -29.7f)
                        horizontalLineToRelative(-4.44f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 88f)
                        curveToRelative(0.78f, 0f, 1.55f, 0f, 2.33f, 0f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 107.34f, 0f)
                        curveToRelative(0.77f, 0f, 1.55f, 0f, 2.33f, 0f)
                        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 144f)
                        close()
                    }
                }.build()

        return _ClubFill!!
    }

@Suppress("ObjectPropertyName")
private var _ClubFill: ImageVector? = null
