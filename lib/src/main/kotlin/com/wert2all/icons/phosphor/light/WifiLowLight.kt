package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.WifiLowLight: ImageVector
    get() {
        if (_WifiLowLight != null) {
            return _WifiLowLight!!
        }
        _WifiLowLight =
            ImageVector
                .Builder(
                    name = "Light.WifiLowLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 204f)
                        moveToRelative(-10f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 165f)
                        arcToRelative(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 0f)
                    }
                }.build()

        return _WifiLowLight!!
    }

@Suppress("ObjectPropertyName")
private var _WifiLowLight: ImageVector? = null
