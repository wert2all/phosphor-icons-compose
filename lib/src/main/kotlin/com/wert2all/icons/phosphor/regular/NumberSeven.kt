package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.NumberSeven: ImageVector
    get() {
        if (_NumberSeven != null) {
            return _NumberSeven!!
        }
        _NumberSeven =
            ImageVector
                .Builder(
                    name = "NumberSeven",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 48f)
                        lineToRelative(80f, 0f)
                        lineToRelative(-48f, 160f)
                    }
                }.build()

        return _NumberSeven!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSeven: ImageVector? = null
