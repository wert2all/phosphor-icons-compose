package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.ArrowUpLeftBold: ImageVector
    get() {
        if (_ArrowUpLeftBold != null) {
            return _ArrowUpLeftBold!!
        }
        _ArrowUpLeftBold =
            ImageVector
                .Builder(
                    name = "Bold.ArrowUpLeftBold",
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
                        moveTo(192f, 192f)
                        lineTo(64f, 64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 64f)
                        lineToRelative(-104f, 0f)
                        lineToRelative(0f, 104f)
                    }
                }.build()

        return _ArrowUpLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpLeftBold: ImageVector? = null
