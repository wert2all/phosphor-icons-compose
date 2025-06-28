package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.ArrowElbowRightDownThin: ImageVector
    get() {
        if (_ArrowElbowRightDownThin != null) {
            return _ArrowElbowRightDownThin!!
        }
        _ArrowElbowRightDownThin =
            ImageVector
                .Builder(
                    name = "ArrowElbowRightDownThin",
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
                        moveTo(128f, 160f)
                        lineToRelative(48f, 48f)
                        lineToRelative(48f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 64f)
                        lineToRelative(144f, 0f)
                        lineToRelative(0f, 144f)
                    }
                }.build()

        return _ArrowElbowRightDownThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightDownThin: ImageVector? = null
