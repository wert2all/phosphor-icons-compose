package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.LineSegmentLight: ImageVector
    get() {
        if (_LineSegmentLight != null) {
            return _LineSegmentLight!!
        }
        _LineSegmentLight =
            ImageVector
                .Builder(
                    name = "Light.LineSegmentLight",
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
                        moveTo(64f, 192f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 64f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(175.03f, 80.97f)
                        lineTo(80.97f, 175.03f)
                    }
                }.build()

        return _LineSegmentLight!!
    }

@Suppress("ObjectPropertyName")
private var _LineSegmentLight: ImageVector? = null
