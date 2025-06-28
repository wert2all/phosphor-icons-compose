package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.DeviceMobileCameraDuotone: ImageVector
    get() {
        if (_DeviceMobileCameraDuotone != null) {
            return _DeviceMobileCameraDuotone!!
        }
        _DeviceMobileCameraDuotone =
            ImageVector
                .Builder(
                    name = "DeviceMobileCameraDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(192f, 40f)
                        lineTo(192f, 216f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 232f)
                        lineTo(80f, 232f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 216f)
                        lineTo(64f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 24f)
                        lineTo(176f, 24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 40f)
                        lineTo(192f, 216f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 232f)
                        lineTo(80f, 232f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 216f)
                        lineTo(64f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 24f)
                        lineTo(176f, 24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 40f)
                        close()
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 60f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                }.build()

        return _DeviceMobileCameraDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMobileCameraDuotone: ImageVector? = null
