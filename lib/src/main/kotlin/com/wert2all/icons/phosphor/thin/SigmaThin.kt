package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.SigmaThin: ImageVector
    get() {
        if (_SigmaThin != null) {
            return _SigmaThin!!
        }
        _SigmaThin =
            ImageVector
                .Builder(
                    name = "SigmaThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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

        return _SigmaThin!!
    }

@Suppress("ObjectPropertyName")
private var _SigmaThin: ImageVector? = null
