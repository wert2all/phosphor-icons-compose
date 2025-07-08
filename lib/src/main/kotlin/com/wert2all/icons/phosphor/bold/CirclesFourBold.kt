package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.CirclesFourBold: ImageVector
    get() {
        if (_CirclesFourBold != null) {
            return _CirclesFourBold!!
        }
        _CirclesFourBold =
            ImageVector
                .Builder(
                    name = "Bold.CirclesFourBold",
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
                        moveTo(78f, 78f)
                        moveToRelative(-30f, 0f)
                        arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60f, 0f)
                        arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, -60f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(178f, 78f)
                        moveToRelative(-30f, 0f)
                        arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60f, 0f)
                        arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, -60f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(78f, 178f)
                        moveToRelative(-30f, 0f)
                        arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60f, 0f)
                        arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, -60f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(178f, 178f)
                        moveToRelative(-30f, 0f)
                        arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60f, 0f)
                        arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, -60f, 0f)
                    }
                }.build()

        return _CirclesFourBold!!
    }

@Suppress("ObjectPropertyName")
private var _CirclesFourBold: ImageVector? = null
