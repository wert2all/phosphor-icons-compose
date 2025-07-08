package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ArrowElbowUpLeftDuotone: ImageVector
    get() {
        if (_ArrowElbowUpLeftDuotone != null) {
            return _ArrowElbowUpLeftDuotone!!
        }
        _ArrowElbowUpLeftDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ArrowElbowUpLeftDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(96f, 128f)
                        lineToRelative(-48f, -48f)
                        lineToRelative(48f, -48f)
                        lineToRelative(0f, 96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 128f)
                        lineToRelative(-48f, -48f)
                        lineToRelative(48f, -48f)
                        lineToRelative(0f, 96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 224f)
                        lineToRelative(0f, -144f)
                        lineToRelative(-96f, 0f)
                    }
                }.build()

        return _ArrowElbowUpLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowUpLeftDuotone: ImageVector? = null
