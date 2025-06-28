package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ArrowsSplitBold: ImageVector
    get() {
        if (_ArrowsSplitBold != null) {
            return _ArrowsSplitBold!!
        }
        _ArrowsSplitBold =
            ImageVector
                .Builder(
                    name = "ArrowsSplitBold",
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
                        moveTo(96f, 184f)
                        lineToRelative(-32f, 32f)
                        lineToRelative(-32f, -32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 184f)
                        lineToRelative(-32f, 32f)
                        lineToRelative(-32f, -32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 24f)
                        lineToRelative(0f, 48f)
                        lineToRelative(-64f, 64f)
                        lineToRelative(0f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 72f)
                        lineToRelative(64f, 64f)
                        lineToRelative(0f, 80f)
                    }
                }.build()

        return _ArrowsSplitBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsSplitBold: ImageVector? = null
