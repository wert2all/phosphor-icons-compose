package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.UniteFill: ImageVector
    get() {
        if (_UniteFill != null) {
            return _UniteFill!!
        }
        _UniteFill =
            ImageVector
                .Builder(
                    name = "Fill.UniteFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(240f, 164f)
                        arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -151.9f, 3.9f)
                        arcToRelative(76f, 76f, 0f, isMoreThanHalf = true, isPositiveArc = true, 79.8f, -79.8f)
                        arcTo(76.1f, 76.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 164f)
                        close()
                    }
                }.build()

        return _UniteFill!!
    }

@Suppress("ObjectPropertyName")
private var _UniteFill: ImageVector? = null
