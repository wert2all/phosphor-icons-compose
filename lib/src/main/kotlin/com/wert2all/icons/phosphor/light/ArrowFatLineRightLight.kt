package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.ArrowFatLineRightLight: ImageVector
    get() {
        if (_ArrowFatLineRightLight != null) {
            return _ArrowFatLineRightLight!!
        }
        _ArrowFatLineRightLight =
            ImageVector
                .Builder(
                    name = "Light.ArrowFatLineRightLight",
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
                        moveTo(136f, 32f)
                        lineToRelative(96f, 96f)
                        lineToRelative(-96f, 96f)
                        lineToRelative(0f, -48f)
                        lineToRelative(-64f, 0f)
                        lineToRelative(0f, -96f)
                        lineToRelative(64f, 0f)
                        lineToRelative(0f, -48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 176f)
                        lineTo(40f, 80f)
                    }
                }.build()

        return _ArrowFatLineRightLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLineRightLight: ImageVector? = null
