package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.ArrowURightDownLight: ImageVector
    get() {
        if (_ArrowURightDownLight != null) {
            return _ArrowURightDownLight!!
        }
        _ArrowURightDownLight =
            ImageVector
                .Builder(
                    name = "Light.ArrowURightDownLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(120f, 176f)
                        lineToRelative(48f, 48f)
                        lineToRelative(48f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 176f)
                        verticalLineTo(88f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -56f)
                        horizontalLineToRelative(0f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
                        verticalLineTo(224f)
                    }
                }.build()

        return _ArrowURightDownLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowURightDownLight: ImageVector? = null
