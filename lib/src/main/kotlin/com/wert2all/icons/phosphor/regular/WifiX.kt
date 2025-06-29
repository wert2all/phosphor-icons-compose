package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.WifiX: ImageVector
    get() {
        if (_WifiX != null) {
            return _WifiX!!
        }
        _WifiX =
            ImageVector
                .Builder(
                    name = "WifiX",
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
                        moveTo(224f, 56f)
                        lineTo(176f, 104f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 104f)
                        lineTo(176f, 56f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 204f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 165f)
                        arcToRelative(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 56.19f)
                        quadToRelative(-4f, -0.19f, -8f, -0.19f)
                        arcTo(163.31f, 163.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 93.19f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 104.27f)
                        quadToRelative(-4f, -0.27f, -8f, -0.27f)
                        arcToRelative(115.51f, 115.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -72f, 25f)
                    }
                }.build()

        return _WifiX!!
    }

@Suppress("ObjectPropertyName")
private var _WifiX: ImageVector? = null
