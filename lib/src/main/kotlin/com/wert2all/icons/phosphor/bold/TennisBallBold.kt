package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.TennisBallBold: ImageVector
    get() {
        if (_TennisBallBold != null) {
            return _TennisBallBold!!
        }
        _TennisBallBold =
            ImageVector
                .Builder(
                    name = "TennisBallBold",
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
                        moveTo(128f, 128f)
                        moveToRelative(-96f, 0f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(127.83f, 32f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 127.83f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 128.17f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128.17f, 224f)
                    }
                }.build()

        return _TennisBallBold!!
    }

@Suppress("ObjectPropertyName")
private var _TennisBallBold: ImageVector? = null
