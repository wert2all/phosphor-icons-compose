package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.DivideLight: ImageVector
    get() {
        if (_DivideLight != null) {
            return _DivideLight!!
        }
        _DivideLight =
            ImageVector
                .Builder(
                    name = "Light.DivideLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 128f)
                        lineTo(216f, 128f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 64f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 192f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                }.build()

        return _DivideLight!!
    }

@Suppress("ObjectPropertyName")
private var _DivideLight: ImageVector? = null
