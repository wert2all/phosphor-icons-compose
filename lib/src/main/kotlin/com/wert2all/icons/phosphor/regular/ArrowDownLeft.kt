package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.ArrowDownLeft: ImageVector
    get() {
        if (_ArrowDownLeft != null) {
            return _ArrowDownLeft!!
        }
        _ArrowDownLeft =
            ImageVector
                .Builder(
                    name = "Regular.ArrowDownLeft",
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
                        moveTo(192f, 64f)
                        lineTo(64f, 192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 192f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, -104f)
                    }
                }.build()

        return _ArrowDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownLeft: ImageVector? = null
