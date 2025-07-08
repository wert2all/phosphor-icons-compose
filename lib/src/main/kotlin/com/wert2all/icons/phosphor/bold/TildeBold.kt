package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.TildeBold: ImageVector
    get() {
        if (_TildeBold != null) {
            return _TildeBold!!
        }
        _TildeBold =
            ImageVector
                .Builder(
                    name = "Bold.TildeBold",
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
                        moveTo(40f, 130.42f)
                        curveToRelative(72f, -89.55f, 104f, 84.71f, 176f, -4.84f)
                    }
                }.build()

        return _TildeBold!!
    }

@Suppress("ObjectPropertyName")
private var _TildeBold: ImageVector? = null
