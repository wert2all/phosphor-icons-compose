package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.AcornLight: ImageVector
    get() {
        if (_AcornLight != null) {
            return _AcornLight!!
        }
        _AcornLight =
            ImageVector
                .Builder(
                    name = "AcornLight",
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
                        moveTo(216f, 112f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 53f, -88f, 88f, -88f, 112f)
                        curveToRelative(0f, -24f, -88f, -59f, -88f, -112f)
                        verticalLineTo(112f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 56f)
                        horizontalLineToRelative(96f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
                        verticalLineToRelative(0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineToRelative(0f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 56f)
                        verticalLineTo(48f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                    }
                }.build()

        return _AcornLight!!
    }

@Suppress("ObjectPropertyName")
private var _AcornLight: ImageVector? = null
