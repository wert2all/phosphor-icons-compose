package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.EarLight: ImageVector
    get() {
        if (_EarLight != null) {
            return _EarLight!!
        }
        _EarLight =
            ImageVector
                .Builder(
                    name = "EarLight",
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
                        moveTo(160f, 216f)
                        curveToRelative(-8.07f, 9.77f, -18.34f, 16f, -32f, 16f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -44f, -44f)
                        curveToRelative(0f, -41.49f, -36f, -28f, -36f, -84f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(173.86f, 168f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 160f)
                        curveToRelative(0f, -24f, 24f, -32f, 24f, -56f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 0f)
                    }
                }.build()

        return _EarLight!!
    }

@Suppress("ObjectPropertyName")
private var _EarLight: ImageVector? = null
