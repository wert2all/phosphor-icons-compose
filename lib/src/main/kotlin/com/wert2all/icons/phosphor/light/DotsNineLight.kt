package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.DotsNineLight: ImageVector
    get() {
        if (_DotsNineLight != null) {
            return _DotsNineLight!!
        }
        _DotsNineLight =
            ImageVector
                .Builder(
                    name = "DotsNineLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(60f, 60f)
                        moveToRelative(-10f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 60f)
                        moveToRelative(-10f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(196f, 60f)
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
                        moveTo(128f, 128f)
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
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(60f, 196f)
                        moveToRelative(-10f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 196f)
                        moveToRelative(-10f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(196f, 196f)
                        moveToRelative(-10f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
                    }
                }.build()

        return _DotsNineLight!!
    }

@Suppress("ObjectPropertyName")
private var _DotsNineLight: ImageVector? = null
