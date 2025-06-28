package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CodeDuotone: ImageVector
    get() {
        if (_CodeDuotone != null) {
            return _CodeDuotone!!
        }
        _CodeDuotone =
            ImageVector
                .Builder(
                    name = "CodeDuotone",
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
                        moveTo(192f, 168f)
                        lineToRelative(48f, -40f)
                        lineToRelative(-48f, -40f)
                        lineToRelative(-128f, 0f)
                        lineToRelative(-48f, 40f)
                        lineToRelative(48f, 40f)
                        lineToRelative(128f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 88f)
                        lineToRelative(-48f, 40f)
                        lineToRelative(48f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 88f)
                        lineToRelative(48f, 40f)
                        lineToRelative(-48f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 40f)
                        lineTo(96f, 216f)
                    }
                }.build()

        return _CodeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CodeDuotone: ImageVector? = null
