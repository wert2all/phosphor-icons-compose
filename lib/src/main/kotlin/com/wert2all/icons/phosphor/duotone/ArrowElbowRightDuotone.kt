package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ArrowElbowRightDuotone: ImageVector
    get() {
        if (_ArrowElbowRightDuotone != null) {
            return _ArrowElbowRightDuotone!!
        }
        _ArrowElbowRightDuotone =
            ImageVector
                .Builder(
                    name = "ArrowElbowRightDuotone",
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
                        moveTo(160f, 80f)
                        lineToRelative(72f, 0f)
                        lineToRelative(0f, 72f)
                        lineToRelative(-72f, -72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 80f)
                        lineToRelative(72f, 0f)
                        lineToRelative(0f, 72f)
                        lineToRelative(-72f, -72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 96f)
                        lineToRelative(96f, 96f)
                        lineToRelative(76f, -76f)
                    }
                }.build()

        return _ArrowElbowRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightDuotone: ImageVector? = null
