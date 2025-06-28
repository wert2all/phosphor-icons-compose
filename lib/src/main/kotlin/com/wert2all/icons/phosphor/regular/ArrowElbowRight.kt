package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.ArrowElbowRight: ImageVector
    get() {
        if (_ArrowElbowRight != null) {
            return _ArrowElbowRight!!
        }
        _ArrowElbowRight =
            ImageVector
                .Builder(
                    name = "ArrowElbowRight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 80f)
                        lineToRelative(72f, 0f)
                        lineToRelative(0f, 72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 96f)
                        lineToRelative(96f, 96f)
                        lineToRelative(112f, -112f)
                    }
                }.build()

        return _ArrowElbowRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRight: ImageVector? = null
