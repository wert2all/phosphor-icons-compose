package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.StackDuotone: ImageVector
    get() {
        if (_StackDuotone != null) {
            return _StackDuotone!!
        }
        _StackDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.StackDuotone",
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
                        moveTo(32f, 80f)
                        lineToRelative(96f, 56f)
                        lineToRelative(96f, -56f)
                        lineToRelative(-96f, -56f)
                        lineToRelative(-96f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 176f)
                        lineToRelative(96f, 56f)
                        lineToRelative(96f, -56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 128f)
                        lineToRelative(96f, 56f)
                        lineToRelative(96f, -56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 80f)
                        lineToRelative(96f, 56f)
                        lineToRelative(96f, -56f)
                        lineToRelative(-96f, -56f)
                        lineToRelative(-96f, 56f)
                        close()
                    }
                }.build()

        return _StackDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StackDuotone: ImageVector? = null
