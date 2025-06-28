package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.SpeakerHifiFill: ImageVector
    get() {
        if (_SpeakerHifiFill != null) {
            return _SpeakerHifiFill!!
        }
        _SpeakerHifiFill =
            ImageVector
                .Builder(
                    name = "SpeakerHifiFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(152f, 160f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, -24f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 160f)
                        close()
                        moveTo(208f, 40f)
                        lineTo(208f, 216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        lineTo(64f, 232f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        lineTo(48f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 24f)
                        lineTo(192f, 24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 40f)
                        close()
                        moveTo(116f, 68f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 116f, 68f)
                        close()
                        moveTo(168f, 160f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -40f, 40f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 160f)
                        close()
                    }
                }.build()

        return _SpeakerHifiFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerHifiFill: ImageVector? = null
