package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.Knife: ImageVector
    get() {
        if (_Knife != null) {
            return _Knife!!
        }
        _Knife =
            ImageVector
                .Builder(
                    name = "Knife",
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
                        moveTo(146f, 90f)
                        lineToRelative(54f, 54f)
                        reflectiveCurveToRelative(-72f, 92f, -176f, 68f)
                        lineTo(198.2f, 37.8f)
                        arcToRelative(19.8f, 19.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 0f)
                        horizontalLineToRelative(0f)
                        arcToRelative(19.8f, 19.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 28f)
                        lineTo(174f, 118f)
                    }
                }.build()

        return _Knife!!
    }

@Suppress("ObjectPropertyName")
private var _Knife: ImageVector? = null
