package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.IntersectThreeBold: ImageVector
    get() {
        if (_IntersectThreeBold != null) {
            return _IntersectThreeBold!!
        }
        _IntersectThreeBold =
            ImageVector
                .Builder(
                    name = "IntersectThreeBold",
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
                        moveTo(128f, 92f)
                        moveToRelative(-60f, 0f)
                        arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120f, 0f)
                        arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, -120f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(164f, 156f)
                        moveToRelative(-60f, 0f)
                        arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120f, 0f)
                        arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, -120f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(92f, 156f)
                        moveToRelative(-60f, 0f)
                        arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120f, 0f)
                        arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, -120f, 0f)
                    }
                }.build()

        return _IntersectThreeBold!!
    }

@Suppress("ObjectPropertyName")
private var _IntersectThreeBold: ImageVector? = null
