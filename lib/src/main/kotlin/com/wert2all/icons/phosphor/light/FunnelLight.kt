package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.FunnelLight: ImageVector
    get() {
        if (_FunnelLight != null) {
            return _FunnelLight!!
        }
        _FunnelLight =
            ImageVector
                .Builder(
                    name = "FunnelLight",
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
                        moveTo(34.1f, 61.38f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                        horizontalLineTo(216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.92f, 13.38f)
                        lineTo(152f, 136f)
                        verticalLineToRelative(58.65f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.56f, 6.66f)
                        lineToRelative(-32f, 21.33f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 216f)
                        verticalLineTo(136f)
                        close()
                    }
                }.build()

        return _FunnelLight!!
    }

@Suppress("ObjectPropertyName")
private var _FunnelLight: ImageVector? = null
