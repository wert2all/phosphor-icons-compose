package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.SpeakerSimpleNoneBold: ImageVector
    get() {
        if (_SpeakerSimpleNoneBold != null) {
            return _SpeakerSimpleNoneBold!!
        }
        _SpeakerSimpleNoneBold =
            ImageVector
                .Builder(
                    name = "Bold.SpeakerSimpleNoneBold",
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
                        moveTo(88f, 168f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineTo(88f)
                        lineToRelative(72f, -56f)
                        verticalLineTo(224f)
                        close()
                    }
                }.build()

        return _SpeakerSimpleNoneBold!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerSimpleNoneBold: ImageVector? = null
