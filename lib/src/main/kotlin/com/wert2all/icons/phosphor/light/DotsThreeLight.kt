package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.DotsThreeLight: ImageVector
    get() {
        if (_DotsThreeLight != null) {
            return _DotsThreeLight!!
        }
        _DotsThreeLight =
            ImageVector
                .Builder(
                    name = "DotsThreeLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 128f)
                        moveToRelative(-10f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(60f, 128f)
                        moveToRelative(-10f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(196f, 128f)
                        moveToRelative(-10f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
                    }
                }.build()

        return _DotsThreeLight!!
    }

@Suppress("ObjectPropertyName")
private var _DotsThreeLight: ImageVector? = null
