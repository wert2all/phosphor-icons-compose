package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.FilePngThin: ImageVector
    get() {
        if (_FilePngThin != null) {
            return _FilePngThin!!
        }
        _FilePngThin =
            ImageVector
                .Builder(
                    name = "Thin.FilePngThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 32f)
                        lineToRelative(0f, 56f)
                        lineToRelative(56f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(44f, 192f)
                        horizontalLineTo(60f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -40f)
                        horizontalLineTo(44f)
                        verticalLineToRelative(56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 184f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(16.87f)
                        arcTo(22.12f, 22.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 208f)
                        curveToRelative(-13.25f, 0f, -24f, -12.54f, -24f, -28f)
                        reflectiveCurveToRelative(10.75f, -28f, 24f, -28f)
                        arcToRelative(21.28f, 21.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.75f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(108f, 208f)
                        lineToRelative(0f, -56f)
                        lineToRelative(40f, 56f)
                        lineToRelative(0f, -56f)
                    }
                }.build()

        return _FilePngThin!!
    }

@Suppress("ObjectPropertyName")
private var _FilePngThin: ImageVector? = null
