package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.BatteryEmpty: ImageVector
    get() {
        if (_BatteryEmpty != null) {
            return _BatteryEmpty!!
        }
        _BatteryEmpty =
            ImageVector
                .Builder(
                    name = "BatteryEmpty",
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
                        moveTo(32f, 64f)
                        lineTo(200f, 64f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 80f)
                        lineTo(216f, 176f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 192f)
                        lineTo(32f, 192f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 176f)
                        lineTo(16f, 80f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(248f, 96f)
                        lineTo(248f, 160f)
                    }
                }.build()

        return _BatteryEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryEmpty: ImageVector? = null
