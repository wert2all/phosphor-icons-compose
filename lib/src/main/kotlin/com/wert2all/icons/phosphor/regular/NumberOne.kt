package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.NumberOne: ImageVector
    get() {
        if (_NumberOne != null) {
            return _NumberOne!!
        }
        _NumberOne =
            ImageVector
                .Builder(
                    name = "Regular.NumberOne",
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
                        moveTo(96f, 72f)
                        lineToRelative(40f, -24f)
                        lineToRelative(0f, 160f)
                    }
                }.build()

        return _NumberOne!!
    }

@Suppress("ObjectPropertyName")
private var _NumberOne: ImageVector? = null
