package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.LightbulbFilament: ImageVector
    get() {
        if (_LightbulbFilament != null) {
            return _LightbulbFilament!!
        }
        _LightbulbFilament =
            ImageVector
                .Builder(
                    name = "LightbulbFilament",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 232f)
                        lineTo(168f, 232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 200f)
                        lineTo(128f, 144f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 112f)
                        lineToRelative(32f, 32f)
                        lineToRelative(32f, -32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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
                }.build()

        return _LightbulbFilament!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbFilament: ImageVector? = null
