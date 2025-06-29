package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.Steps: ImageVector
    get() {
        if (_Steps != null) {
            return _Steps!!
        }
        _Steps =
            ImageVector
                .Builder(
                    name = "Steps",
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
                        moveTo(16f, 200f)
                        lineToRelative(56f, 0f)
                        lineToRelative(0f, -48f)
                        lineToRelative(56f, 0f)
                        lineToRelative(0f, -48f)
                        lineToRelative(56f, 0f)
                        lineToRelative(0f, -48f)
                        lineToRelative(56f, 0f)
                    }
                }.build()

        return _Steps!!
    }

@Suppress("ObjectPropertyName")
private var _Steps: ImageVector? = null
