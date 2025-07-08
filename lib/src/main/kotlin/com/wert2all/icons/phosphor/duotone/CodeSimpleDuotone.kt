package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.CodeSimpleDuotone: ImageVector
    get() {
        if (_CodeSimpleDuotone != null) {
            return _CodeSimpleDuotone!!
        }
        _CodeSimpleDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.CodeSimpleDuotone",
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
                        moveTo(168f, 192f)
                        lineToRelative(72f, -64f)
                        lineToRelative(-72f, -64f)
                        lineToRelative(-80f, 0f)
                        lineToRelative(-72f, 64f)
                        lineToRelative(72f, 64f)
                        lineToRelative(80f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 64f)
                        lineToRelative(-72f, 64f)
                        lineToRelative(72f, 64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 64f)
                        lineToRelative(72f, 64f)
                        lineToRelative(-72f, 64f)
                    }
                }.build()

        return _CodeSimpleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CodeSimpleDuotone: ImageVector? = null
