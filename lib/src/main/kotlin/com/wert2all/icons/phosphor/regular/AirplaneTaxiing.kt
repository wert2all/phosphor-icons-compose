package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.AirplaneTaxiing: ImageVector
    get() {
        if (_AirplaneTaxiing != null) {
            return _AirplaneTaxiing!!
        }
        _AirplaneTaxiing =
            ImageVector
                .Builder(
                    name = "Regular.AirplaneTaxiing",
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
                        moveTo(144f, 104f)
                        horizontalLineToRelative(64f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                        verticalLineToRelative(24f)
                        horizontalLineTo(61.06f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -30.65f, -22.8f)
                        lineTo(16.34f, 90.3f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 80f)
                        horizontalLineToRelative(8f)
                        lineToRelative(24f, 24f)
                        horizontalLineTo(92.91f)
                        lineTo(80.42f, 66.53f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 56f)
                        horizontalLineToRelative(8f)
                        close()
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(208f, 200f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(112f, 200f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                }.build()

        return _AirplaneTaxiing!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneTaxiing: ImageVector? = null
