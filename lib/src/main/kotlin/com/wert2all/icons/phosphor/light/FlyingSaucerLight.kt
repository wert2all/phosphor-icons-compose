package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.FlyingSaucerLight: ImageVector
    get() {
        if (_FlyingSaucerLight != null) {
            return _FlyingSaucerLight!!
        }
        _FlyingSaucerLight =
            ImageVector
                .Builder(
                    name = "Light.FlyingSaucerLight",
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
                        moveTo(168f, 192f)
                        lineTo(176f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 192f)
                        lineTo(128f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 192f)
                        lineTo(80f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
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
                        strokeLineWidth = 12f,
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

        return _FlyingSaucerLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlyingSaucerLight: ImageVector? = null
