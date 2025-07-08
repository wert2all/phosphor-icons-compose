package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.FlyingSaucerDuotone: ImageVector
    get() {
        if (_FlyingSaucerDuotone != null) {
            return _FlyingSaucerDuotone!!
        }
        _FlyingSaucerDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.FlyingSaucerDuotone",
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
                        moveTo(177f, 68.82f)
                        horizontalLineToRelative(0f)
                        arcTo(55.7f, 55.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 96f)
                        verticalLineToRelative(3.9f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.35f, 15.52f)
                        arcTo(195.71f, 195.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 120f)
                        arcToRelative(
                            195.87f,
                            195.87f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = true,
                            -43.65f,
                            -4.58f,
                        )
                        arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 99.9f)
                        verticalLineTo(96.83f)
                        arcToRelative(57.07f, 57.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.37f, -28.08f)
                        horizontalLineToRelative(0f)
                        curveTo(41.86f, 76.51f, 16f, 93f, 16f, 112f)
                        curveToRelative(0f, 26.51f, 50.14f, 48f, 112f, 48f)
                        reflectiveCurveToRelative(112f, -21.49f, 112f, -48f)
                        curveTo(240f, 93f, 214.29f, 76.61f, 177f, 68.82f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 192f)
                        lineTo(176f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 192f)
                        lineTo(128f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 192f)
                        lineTo(80f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(177f, 68.82f)
                        curveTo(214.29f, 76.61f, 240f, 93f, 240f, 112f)
                        curveToRelative(0f, 26.51f, -50.14f, 48f, -112f, 48f)
                        reflectiveCurveTo(16f, 138.51f, 16f, 112f)
                        curveToRelative(0f, -19f, 25.86f, -35.49f, 63.35f, -43.25f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 99.9f)
                        arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.34f, 15.52f)
                        arcTo(195.87f, 195.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 120f)
                        arcToRelative(
                            195.71f,
                            195.71f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = false,
                            43.64f,
                            -4.58f,
                        )
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 99.9f)
                        verticalLineTo(96f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56.74f, -56f)
                        curveTo(96.48f, 40.4f, 72f, 66.06f, 72f, 96.83f)
                        close()
                    }
                }.build()

        return _FlyingSaucerDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FlyingSaucerDuotone: ImageVector? = null
