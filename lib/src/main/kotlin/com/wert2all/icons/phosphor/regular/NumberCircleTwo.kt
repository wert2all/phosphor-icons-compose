package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.NumberCircleTwo: ImageVector
    get() {
        if (_NumberCircleTwo != null) {
            return _NumberCircleTwo!!
        }
        _NumberCircleTwo =
            ImageVector
                .Builder(
                    name = "NumberCircleTwo",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 176f)
                        horizontalLineTo(104f)
                        lineToRelative(43.17f, -57.56f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 105.37f, 96f)
                    }
                }.build()

        return _NumberCircleTwo!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleTwo: ImageVector? = null
