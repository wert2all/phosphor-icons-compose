package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.SnapchatLogo: ImageVector
    get() {
        if (_SnapchatLogo != null) {
            return _SnapchatLogo!!
        }
        _SnapchatLogo =
            ImageVector
                .Builder(
                    name = "SnapchatLogo",
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
                        moveTo(167.77f, 223.44f)
                        curveToRelative(-12.08f, 3.09f, -26.72f, -7.56f, -39.77f, -7.56f)
                        reflectiveCurveToRelative(-27.69f, 10.65f, -39.77f, 7.56f)
                        curveToRelative(-12.5f, -3.2f, -18.53f, -22.69f, -29.57f, -28.76f)
                        curveToRelative(-11.21f, -6.17f, -33.4f, -2.09f, -42.66f, -10.78f)
                        curveToRelative(0f, 0f, 56f, -20f, 56f, -103.93f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 0f)
                        curveToRelative(0f, 83.89f, 56f, 103.93f, 56f, 103.93f)
                        curveToRelative(-9.26f, 8.69f, -31.45f, 4.61f, -42.66f, 10.78f)
                        curveTo(186.3f, 200.75f, 180.27f, 220.24f, 167.77f, 223.44f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(66.31f, 122.53f)
                        lineTo(40f, 112f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(189.69f, 122.53f)
                        lineTo(216f, 112f)
                    }
                }.build()

        return _SnapchatLogo!!
    }

@Suppress("ObjectPropertyName")
private var _SnapchatLogo: ImageVector? = null
