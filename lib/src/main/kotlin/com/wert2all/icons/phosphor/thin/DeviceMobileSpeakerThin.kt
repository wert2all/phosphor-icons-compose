package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.DeviceMobileSpeakerThin: ImageVector
    get() {
        if (_DeviceMobileSpeakerThin != null) {
            return _DeviceMobileSpeakerThin!!
        }
        _DeviceMobileSpeakerThin =
            ImageVector
                .Builder(
                    name = "Thin.DeviceMobileSpeakerThin",
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
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 56f)
                        lineTo(160f, 56f)
                    }
                }.build()

        return _DeviceMobileSpeakerThin!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMobileSpeakerThin: ImageVector? = null
