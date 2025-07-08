package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.BracketsAngleLight: ImageVector
    get() {
        if (_BracketsAngleLight != null) {
            return _BracketsAngleLight!!
        }
        _BracketsAngleLight =
            ImageVector
                .Builder(
                    name = "Light.BracketsAngleLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 40f)
                        lineToRelative(-56f, 88f)
                        lineToRelative(56f, 88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 40f)
                        lineToRelative(56f, 88f)
                        lineToRelative(-56f, 88f)
                    }
                }.build()

        return _BracketsAngleLight!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsAngleLight: ImageVector? = null
