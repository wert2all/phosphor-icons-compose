package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.CirclesFourFill: ImageVector
    get() {
        if (_CirclesFourFill != null) {
            return _CirclesFourFill!!
        }
        _CirclesFourFill =
            ImageVector
                .Builder(
                    name = "Fill.CirclesFourFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(120f, 80f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 40f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 80f)
                        close()
                        moveTo(176f, 120f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -40f, -40f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 120f)
                        close()
                        moveTo(80f, 136f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 40f, 40f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 136f)
                        close()
                        moveTo(176f, 136f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 40f, 40f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 136f)
                        close()
                    }
                }.build()

        return _CirclesFourFill!!
    }

@Suppress("ObjectPropertyName")
private var _CirclesFourFill: ImageVector? = null
