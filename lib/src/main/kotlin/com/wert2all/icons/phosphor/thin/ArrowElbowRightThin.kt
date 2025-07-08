package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ArrowElbowRightThin: ImageVector
    get() {
        if (_ArrowElbowRightThin != null) {
            return _ArrowElbowRightThin!!
        }
        _ArrowElbowRightThin =
            ImageVector
                .Builder(
                    name = "Thin.ArrowElbowRightThin",
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
                        moveTo(160f, 80f)
                        lineToRelative(72f, 0f)
                        lineToRelative(0f, 72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 96f)
                        lineToRelative(96f, 96f)
                        lineToRelative(112f, -112f)
                    }
                }.build()

        return _ArrowElbowRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightThin: ImageVector? = null
