package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.CirclesThreeFill: ImageVector
    get() {
        if (_CirclesThreeFill != null) {
            return _CirclesThreeFill!!
        }
        _CirclesThreeFill =
            ImageVector
                .Builder(
                    name = "CirclesThreeFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 120f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 44f, -44f)
                        arcTo(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 120f)
                        close()
                        moveTo(188f, 128f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 44f, 44f)
                        arcTo(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 188f, 128f)
                        close()
                        moveTo(68f, 128f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 44f, 44f)
                        arcTo(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 68f, 128f)
                        close()
                    }
                }.build()

        return _CirclesThreeFill!!
    }

@Suppress("ObjectPropertyName")
private var _CirclesThreeFill: ImageVector? = null
