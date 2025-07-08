package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.InfinityBold: ImageVector
    get() {
        if (_InfinityBold != null) {
            return _InfinityBold!!
        }
        _InfinityBold =
            ImageVector
                .Builder(
                    name = "Bold.InfinityBold",
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
                        moveTo(101.28f, 158.17f)
                        lineToRelative(-3.34f, 3.77f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -67.88f)
                        lineToRelative(60.12f, 67.88f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -67.88f)
                        lineToRelative(-3.34f, 3.77f)
                    }
                }.build()

        return _InfinityBold!!
    }

@Suppress("ObjectPropertyName")
private var _InfinityBold: ImageVector? = null
