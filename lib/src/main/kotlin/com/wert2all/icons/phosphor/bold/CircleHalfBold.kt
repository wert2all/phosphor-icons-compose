package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.CircleHalfBold: ImageVector
    get() {
        if (_CircleHalfBold != null) {
            return _CircleHalfBold!!
        }
        _CircleHalfBold =
            ImageVector
                .Builder(
                    name = "Bold.CircleHalfBold",
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
                        moveTo(128f, 32f)
                        lineTo(128f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 44.84f)
                        lineTo(176f, 211.16f)
                    }
                }.build()

        return _CircleHalfBold!!
    }

@Suppress("ObjectPropertyName")
private var _CircleHalfBold: ImageVector? = null
