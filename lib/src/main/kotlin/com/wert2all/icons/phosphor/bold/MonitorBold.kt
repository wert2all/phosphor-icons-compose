package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.MonitorBold: ImageVector
    get() {
        if (_MonitorBold != null) {
            return _MonitorBold!!
        }
        _MonitorBold =
            ImageVector
                .Builder(
                    name = "MonitorBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 192f)
                        lineTo(48f, 192f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 176f)
                        lineTo(32f, 64f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
                        lineTo(208f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 64f)
                        lineTo(224f, 176f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 192f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 228f)
                        lineTo(96f, 228f)
                    }
                }.build()

        return _MonitorBold!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorBold: ImageVector? = null
