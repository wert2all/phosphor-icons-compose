package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.TextAaBold: ImageVector
    get() {
        if (_TextAaBold != null) {
            return _TextAaBold!!
        }
        _TextAaBold =
            ImageVector
                .Builder(
                    name = "TextAaBold",
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
                        moveTo(144f, 192f)
                        lineToRelative(-64f, -136f)
                        lineToRelative(-64f, 136f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 164f)
                        arcToRelative(32f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                        arcToRelative(32f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(232f, 192f)
                        verticalLineTo(124f)
                        curveToRelative(0f, -15.46f, -14.33f, -28f, -32f, -28f)
                        curveToRelative(-9.56f, 0f, -18.14f, 2.18f, -24f, 8f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(125.18f, 152f)
                        lineTo(34.82f, 152f)
                    }
                }.build()

        return _TextAaBold!!
    }

@Suppress("ObjectPropertyName")
private var _TextAaBold: ImageVector? = null
