package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.SigmaDuotone: ImageVector
    get() {
        if (_SigmaDuotone != null) {
            return _SigmaDuotone!!
        }
        _SigmaDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.SigmaDuotone",
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
                        moveTo(192f, 48f)
                        lineToRelative(-128f, 0f)
                        lineToRelative(64f, 80f)
                        lineToRelative(-64f, 80f)
                        lineToRelative(128f, 0f)
                        lineToRelative(0f, -160f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 72f)
                        lineToRelative(0f, -24f)
                        lineToRelative(-128f, 0f)
                        lineToRelative(64f, 80f)
                        lineToRelative(-64f, 80f)
                        lineToRelative(128f, 0f)
                        lineToRelative(0f, -24f)
                    }
                }.build()

        return _SigmaDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SigmaDuotone: ImageVector? = null
