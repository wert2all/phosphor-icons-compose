package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ArrowElbowRightUpThin: ImageVector
    get() {
        if (_ArrowElbowRightUpThin != null) {
            return _ArrowElbowRightUpThin!!
        }
        _ArrowElbowRightUpThin =
            ImageVector
                .Builder(
                    name = "Thin.ArrowElbowRightUpThin",
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
                        moveTo(120f, 96f)
                        lineToRelative(48f, -48f)
                        lineToRelative(48f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 192f)
                        lineToRelative(144f, 0f)
                        lineToRelative(0f, -144f)
                    }
                }.build()

        return _ArrowElbowRightUpThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightUpThin: ImageVector? = null
