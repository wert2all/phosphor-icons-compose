package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.TipiBold: ImageVector
    get() {
        if (_TipiBold != null) {
            return _TipiBold!!
        }
        _TipiBold =
            ImageVector
                .Builder(
                    name = "Bold.TipiBold",
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
                        moveTo(104f, 16f)
                        lineToRelative(128f, 200f)
                        lineToRelative(-208f, 0f)
                        lineToRelative(128f, -200f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(74.24f, 216f)
                        lineToRelative(53.76f, -84f)
                        lineToRelative(53.76f, 84f)
                    }
                }.build()

        return _TipiBold!!
    }

@Suppress("ObjectPropertyName")
private var _TipiBold: ImageVector? = null
