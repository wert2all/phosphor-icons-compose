package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.SigmaBold: ImageVector
    get() {
        if (_SigmaBold != null) {
            return _SigmaBold!!
        }
        _SigmaBold =
            ImageVector
                .Builder(
                    name = "SigmaBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
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

        return _SigmaBold!!
    }

@Suppress("ObjectPropertyName")
private var _SigmaBold: ImageVector? = null
