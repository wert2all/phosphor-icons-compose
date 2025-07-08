package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Coins: ImageVector
    get() {
        if (_Coins != null) {
            return _Coins!!
        }
        _Coins =
            ImageVector
                .Builder(
                    name = "Regular.Coins",
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
                        moveTo(16f, 84f)
                        arcToRelative(80f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 160f, 0f)
                        arcToRelative(80f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -160f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 84f)
                        verticalLineToRelative(40f)
                        curveToRelative(0f, 19.88f, 35.82f, 36f, 80f, 36f)
                        reflectiveCurveToRelative(80f, -16.12f, 80f, -36f)
                        verticalLineTo(84f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 117f)
                        lineTo(64f, 157f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 96.72f)
                        curveToRelative(36.52f, 3.34f, 64f, 17.86f, 64f, 35.28f)
                        curveToRelative(0f, 19.88f, -35.82f, 36f, -80f, 36f)
                        curveToRelative(-19.6f, 0f, -37.56f, -3.17f, -51.47f, -8.44f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 159.28f)
                        verticalLineTo(172f)
                        curveToRelative(0f, 19.88f, 35.82f, 36f, 80f, 36f)
                        reflectiveCurveToRelative(80f, -16.12f, 80f, -36f)
                        verticalLineTo(132f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 165f)
                        lineTo(192f, 205f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 117f)
                        lineTo(128f, 205f)
                    }
                }.build()

        return _Coins!!
    }

@Suppress("ObjectPropertyName")
private var _Coins: ImageVector? = null
