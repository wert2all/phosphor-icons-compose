package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.ArrowArcRightBold: ImageVector
    get() {
        if (_ArrowArcRightBold != null) {
            return _ArrowArcRightBold!!
        }
        _ArrowArcRightBold =
            ImageVector
                .Builder(
                    name = "Bold.ArrowArcRightBold",
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
                        moveTo(168f, 152f)
                        lineToRelative(64f, 0f)
                        lineToRelative(0f, -64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 184f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 163.88f, -67.88f)
                        lineTo(232f, 152f)
                    }
                }.build()

        return _ArrowArcRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowArcRightBold: ImageVector? = null
