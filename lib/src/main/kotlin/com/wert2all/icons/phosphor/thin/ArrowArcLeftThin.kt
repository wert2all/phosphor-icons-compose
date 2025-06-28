package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.ArrowArcLeftThin: ImageVector
    get() {
        if (_ArrowArcLeftThin != null) {
            return _ArrowArcLeftThin!!
        }
        _ArrowArcLeftThin =
            ImageVector
                .Builder(
                    name = "ArrowArcLeftThin",
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
                        moveTo(88f, 152f)
                        lineToRelative(-64f, 0f)
                        lineToRelative(0f, -64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 184f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 60.12f, 116.12f)
                        lineTo(24f, 152f)
                    }
                }.build()

        return _ArrowArcLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowArcLeftThin: ImageVector? = null
