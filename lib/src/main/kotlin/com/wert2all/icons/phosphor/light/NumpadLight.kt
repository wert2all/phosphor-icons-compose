package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.NumpadLight: ImageVector
    get() {
        if (_NumpadLight != null) {
            return _NumpadLight!!
        }
        _NumpadLight =
            ImageVector
                .Builder(
                    name = "NumpadLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(64f, 48f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 48f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(192f, 48f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(64f, 104f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 104f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(192f, 104f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(64f, 160f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 160f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 216f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(192f, 160f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                }.build()

        return _NumpadLight!!
    }

@Suppress("ObjectPropertyName")
private var _NumpadLight: ImageVector? = null
