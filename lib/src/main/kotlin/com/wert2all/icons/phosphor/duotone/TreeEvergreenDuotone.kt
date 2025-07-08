package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.TreeEvergreenDuotone: ImageVector
    get() {
        if (_TreeEvergreenDuotone != null) {
            return _TreeEvergreenDuotone!!
        }
        _TreeEvergreenDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.TreeEvergreenDuotone",
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
                        moveTo(128f, 16f)
                        lineToRelative(-80f, 104f)
                        lineToRelative(40f, 0f)
                        lineToRelative(-56f, 72f)
                        lineToRelative(192f, 0f)
                        lineToRelative(-56f, -72f)
                        lineToRelative(40f, 0f)
                        lineToRelative(-80f, -104f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 16f)
                        lineToRelative(-80f, 104f)
                        lineToRelative(40f, 0f)
                        lineToRelative(-56f, 72f)
                        lineToRelative(192f, 0f)
                        lineToRelative(-56f, -72f)
                        lineToRelative(40f, 0f)
                        lineToRelative(-80f, -104f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 192f)
                        lineTo(128f, 240f)
                    }
                }.build()

        return _TreeEvergreenDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TreeEvergreenDuotone: ImageVector? = null
