package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ArrowElbowRightDownDuotone: ImageVector
    get() {
        if (_ArrowElbowRightDownDuotone != null) {
            return _ArrowElbowRightDownDuotone!!
        }
        _ArrowElbowRightDownDuotone =
            ImageVector
                .Builder(
                    name = "ArrowElbowRightDownDuotone",
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
                        moveTo(128f, 160f)
                        lineToRelative(48f, 48f)
                        lineToRelative(48f, -48f)
                        lineToRelative(-96f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 160f)
                        lineToRelative(48f, 48f)
                        lineToRelative(48f, -48f)
                        lineToRelative(-96f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 64f)
                        lineToRelative(144f, 0f)
                        lineToRelative(0f, 96f)
                    }
                }.build()

        return _ArrowElbowRightDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightDownDuotone: ImageVector? = null
