package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.HandGrabbingLight: ImageVector
    get() {
        if (_HandGrabbingLight != null) {
            return _HandGrabbingLight!!
        }
        _HandGrabbingLight =
            ImageVector
                .Builder(
                    name = "HandGrabbingLight",
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
                        moveTo(128f, 92f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 0f)
                        verticalLineToRelative(28f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 108f)
                        verticalLineTo(92f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 0f)
                        verticalLineToRelative(28f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 152f)
                        verticalLineTo(120f)
                        horizontalLineTo(68f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20f, 20f)
                        verticalLineToRelative(12f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 0f)
                        verticalLineTo(108f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 0f)
                        verticalLineToRelative(12f)
                    }
                }.build()

        return _HandGrabbingLight!!
    }

@Suppress("ObjectPropertyName")
private var _HandGrabbingLight: ImageVector? = null
