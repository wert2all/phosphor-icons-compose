package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.NumberThreeBold: ImageVector
    get() {
        if (_NumberThreeBold != null) {
            return _NumberThreeBold!!
        }
        _NumberThreeBold =
            ImageVector
                .Builder(
                    name = "NumberThreeBold",
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
                        moveTo(88f, 48f)
                        horizontalLineToRelative(80f)
                        lineToRelative(-48f, 64f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 83.78f)
                    }
                }.build()

        return _NumberThreeBold!!
    }

@Suppress("ObjectPropertyName")
private var _NumberThreeBold: ImageVector? = null
