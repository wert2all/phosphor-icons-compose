package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.FileJpgLight: ImageVector
    get() {
        if (_FileJpgLight != null) {
            return _FileJpgLight!!
        }
        _FileJpgLight =
            ImageVector
                .Builder(
                    name = "FileJpgLight",
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
                        moveTo(48f, 112f)
                        verticalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(96f)
                        lineToRelative(56f, 56f)
                        verticalLineToRelative(24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 32f)
                        lineToRelative(0f, 56f)
                        lineToRelative(56f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 192f)
                        horizontalLineToRelative(16f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -40f)
                        horizontalLineTo(104f)
                        verticalLineToRelative(56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 184f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(16.87f)
                        arcTo(22.12f, 22.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 208f)
                        curveToRelative(-13.25f, 0f, -24f, -12.54f, -24f, -28f)
                        reflectiveCurveToRelative(10.75f, -28f, 24f, -28f)
                        arcToRelative(21.28f, 21.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.75f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(36f, 190f)
                        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 0f)
                        verticalLineTo(152f)
                    }
                }.build()

        return _FileJpgLight!!
    }

@Suppress("ObjectPropertyName")
private var _FileJpgLight: ImageVector? = null
