package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.NumberCircleFive: ImageVector
    get() {
        if (_NumberCircleFive != null) {
            return _NumberCircleFive!!
        }
        _NumberCircleFive =
            ImageVector
                .Builder(
                    name = "Regular.NumberCircleFive",
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
                        moveTo(152f, 80f)
                        horizontalLineTo(112f)
                        lineToRelative(-8f, 48f)
                        arcToRelative(27.57f, 27.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, -8f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 56f)
                        arcToRelative(27.57f, 27.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, -8f)
                    }
                }.build()

        return _NumberCircleFive!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleFive: ImageVector? = null
