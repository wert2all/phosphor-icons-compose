package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.BatteryPlusVerticalThin: ImageVector
    get() {
        if (_BatteryPlusVerticalThin != null) {
            return _BatteryPlusVerticalThin!!
        }
        _BatteryPlusVerticalThin =
            ImageVector
                .Builder(
                    name = "BatteryPlusVerticalThin",
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
                        moveTo(96f, 8f)
                        lineTo(160f, 8f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 40f)
                        lineTo(176f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 56f)
                        lineTo(192f, 224f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 240f)
                        lineTo(80f, 240f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 224f)
                        lineTo(64f, 56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 112f)
                        lineTo(128f, 168f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(100f, 140f)
                        lineTo(156f, 140f)
                    }
                }.build()

        return _BatteryPlusVerticalThin!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryPlusVerticalThin: ImageVector? = null
