package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.TimerBold: ImageVector
    get() {
        if (_TimerBold != null) {
            return _TimerBold!!
        }
        _TimerBold =
            ImageVector
                .Builder(
                    name = "Bold.TimerBold",
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
                        moveTo(128f, 140f)
                        moveToRelative(-84f, 0f)
                        arcToRelative(84f, 84f, 0f, isMoreThanHalf = true, isPositiveArc = true, 168f, 0f)
                        arcToRelative(84f, 84f, 0f, isMoreThanHalf = true, isPositiveArc = true, -168f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 136f)
                        lineTo(156f, 108f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 16f)
                        lineTo(152f, 16f)
                    }
                }.build()

        return _TimerBold!!
    }

@Suppress("ObjectPropertyName")
private var _TimerBold: ImageVector? = null
