package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.AirplaneTakeoffThin: ImageVector
    get() {
        if (_AirplaneTakeoffThin != null) {
            return _AirplaneTakeoffThin!!
        }
        _AirplaneTakeoffThin =
            ImageVector
                .Builder(
                    name = "AirplaneTakeoffThin",
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
                        moveTo(24f, 216f)
                        lineTo(168f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 116.51f)
                        lineTo(58.65f, 88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, -13.3f)
                        lineTo(68f, 72f)
                        lineToRelative(57.53f, 21.17f)
                        lineToRelative(54.84f, -32.75f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41f, 7.32f)
                        lineTo(240f, 91.64f)
                        lineToRelative(-147.41f, 88f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -38f, -4.32f)
                        lineTo(18.53f, 140f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.32f, -13.19f)
                        lineTo(24f, 125.27f)
                        lineTo(55.79f, 136f)
                        close()
                    }
                }.build()

        return _AirplaneTakeoffThin!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneTakeoffThin: ImageVector? = null
