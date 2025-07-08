package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.GogglesDuotone: ImageVector
    get() {
        if (_GogglesDuotone != null) {
            return _GogglesDuotone!!
        }
        _GogglesDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.GogglesDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(232f, 152f)
                        curveToRelative(0f, 17.67f, -30.33f, 32f, -48f, 32f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -64f)
                        curveTo(201.67f, 120f, 232f, 134.33f, 232f, 152f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(104f, 152f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                        curveToRelative(-17.67f, 0f, -48f, -14.33f, -48f, -32f)
                        reflectiveCurveToRelative(30.33f, -32f, 48f, -32f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 152f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 152f)
                        lineTo(152f, 152f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(232f, 152f)
                        curveToRelative(0f, 17.67f, -30.33f, 32f, -48f, 32f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -64f)
                        curveTo(201.67f, 120f, 232f, 134.33f, 232f, 152f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 152f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                        curveToRelative(-17.67f, 0f, -48f, -14.33f, -48f, -32f)
                        reflectiveCurveToRelative(30.33f, -32f, 48f, -32f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 152f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(165.73f, 125.73f)
                        lineTo(214.63f, 174.63f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(46.59f, 126.59f)
                        lineTo(94.63f, 174.63f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(232f, 152f)
                        horizontalLineToRelative(0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        horizontalLineToRelative(0f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, -64f)
                        horizontalLineTo(72f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 136f)
                        horizontalLineTo(8f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineToRelative(0f)
                    }
                }.build()

        return _GogglesDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GogglesDuotone: ImageVector? = null
