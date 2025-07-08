package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.LassoLight: ImageVector
    get() {
        if (_LassoLight != null) {
            return _LassoLight!!
        }
        _LassoLight =
            ImageVector
                .Builder(
                    name = "Light.LassoLight",
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
                        moveTo(24f, 112f)
                        arcToRelative(104f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 208f, 0f)
                        arcToRelative(104f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -208f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 225.6f)
                        curveToRelative(32f, 16.7f, 80f, 0f, 80f, -41.77f)
                        curveToRelative(0f, -53.66f, -60.64f, -62.5f, -70.62f, -24.85f)
                    }
                }.build()

        return _LassoLight!!
    }

@Suppress("ObjectPropertyName")
private var _LassoLight: ImageVector? = null
