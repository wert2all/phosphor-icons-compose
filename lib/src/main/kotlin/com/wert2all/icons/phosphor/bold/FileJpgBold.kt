package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.FileJpgBold: ImageVector
    get() {
        if (_FileJpgBold != null) {
            return _FileJpgBold!!
        }
        _FileJpgBold =
            ImageVector
                .Builder(
                    name = "Bold.FileJpgBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(148f, 32f)
                        lineToRelative(0f, 60f)
                        lineToRelative(60f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 108f)
                        verticalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(96f)
                        lineToRelative(56f, 56f)
                        verticalLineToRelative(20f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
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
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 188f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(12.87f)
                        arcTo(22.12f, 22.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 208f)
                        curveToRelative(-13.25f, 0f, -24f, -12.54f, -24f, -28f)
                        reflectiveCurveToRelative(10.75f, -28f, 24f, -28f)
                        arcToRelative(21.28f, 21.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.75f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 190f)
                        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 0f)
                        verticalLineTo(152f)
                    }
                }.build()

        return _FileJpgBold!!
    }

@Suppress("ObjectPropertyName")
private var _FileJpgBold: ImageVector? = null
