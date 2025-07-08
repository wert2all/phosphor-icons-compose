package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.BiohazardLight: ImageVector
    get() {
        if (_BiohazardLight != null) {
            return _BiohazardLight!!
        }
        _BiohazardLight =
            ImageVector
                .Builder(
                    name = "Light.BiohazardLight",
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
                        moveTo(128f, 132f)
                        moveToRelative(-56f, 0f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 207.83f)
                        arcTo(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 232f, 164f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 164f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 43.83f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 27.79f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                }.build()

        return _BiohazardLight!!
    }

@Suppress("ObjectPropertyName")
private var _BiohazardLight: ImageVector? = null
