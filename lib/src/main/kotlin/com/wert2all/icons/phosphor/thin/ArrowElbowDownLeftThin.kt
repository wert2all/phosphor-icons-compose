package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ArrowElbowDownLeftThin: ImageVector
    get() {
        if (_ArrowElbowDownLeftThin != null) {
            return _ArrowElbowDownLeftThin!!
        }
        _ArrowElbowDownLeftThin =
            ImageVector
                .Builder(
                    name = "Thin.ArrowElbowDownLeftThin",
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
                        moveTo(96f, 128f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(48f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 32f)
                        lineToRelative(0f, 144f)
                        lineToRelative(-144f, 0f)
                    }
                }.build()

        return _ArrowElbowDownLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowDownLeftThin: ImageVector? = null
