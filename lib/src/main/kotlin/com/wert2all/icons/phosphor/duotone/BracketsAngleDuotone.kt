package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.BracketsAngleDuotone: ImageVector
    get() {
        if (_BracketsAngleDuotone != null) {
            return _BracketsAngleDuotone!!
        }
        _BracketsAngleDuotone =
            ImageVector
                .Builder(
                    name = "BracketsAngleDuotone",
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
                        moveTo(176f, 216f)
                        lineToRelative(56f, -88f)
                        lineToRelative(-56f, -88f)
                        lineToRelative(-96f, 0f)
                        lineToRelative(-56f, 88f)
                        lineToRelative(56f, 88f)
                        lineToRelative(96f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 40f)
                        lineToRelative(-56f, 88f)
                        lineToRelative(56f, 88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 40f)
                        lineToRelative(56f, 88f)
                        lineToRelative(-56f, 88f)
                    }
                }.build()

        return _BracketsAngleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsAngleDuotone: ImageVector? = null
