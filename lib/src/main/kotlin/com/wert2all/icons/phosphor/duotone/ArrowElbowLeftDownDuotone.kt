package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ArrowElbowLeftDownDuotone: ImageVector
    get() {
        if (_ArrowElbowLeftDownDuotone != null) {
            return _ArrowElbowLeftDownDuotone!!
        }
        _ArrowElbowLeftDownDuotone =
            ImageVector
                .Builder(
                    name = "ArrowElbowLeftDownDuotone",
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
                        moveTo(136f, 168f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(-48f, -48f)
                        lineToRelative(96f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 168f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(-48f, -48f)
                        lineToRelative(96f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(232f, 72f)
                        lineToRelative(-144f, 0f)
                        lineToRelative(0f, 96f)
                    }
                }.build()

        return _ArrowElbowLeftDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowLeftDownDuotone: ImageVector? = null
