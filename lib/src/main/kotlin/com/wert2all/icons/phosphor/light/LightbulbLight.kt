package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.LightbulbLight: ImageVector
    get() {
        if (_LightbulbLight != null) {
            return _LightbulbLight!!
        }
        _LightbulbLight =
            ImageVector
                .Builder(
                    name = "LightbulbLight",
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
                        moveTo(88f, 232f)
                        lineTo(168f, 232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(78.7f, 167f)
                        arcTo(79.87f, 79.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 104.45f)
                        curveTo(47.76f, 61.09f, 82.72f, 25f, 126.07f, 24f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 51.34f, 142.9f)
                        arcTo(24.3f, 24.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 186f)
                        verticalLineToRelative(6f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineToRelative(-6f)
                        arcTo(24.11f, 24.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78.7f, 167f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 56f)
                        curveToRelative(20f, 3.37f, 36.61f, 20f, 40f, 40f)
                    }
                }.build()

        return _LightbulbLight!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbLight: ImageVector? = null
