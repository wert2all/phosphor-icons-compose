package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.ArrowULeftDown: ImageVector
    get() {
        if (_ArrowULeftDown != null) {
            return _ArrowULeftDown!!
        }
        _ArrowULeftDown =
            ImageVector
                .Builder(
                    name = "Regular.ArrowULeftDown",
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
                        moveTo(136f, 176f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(-48f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 176f)
                        verticalLineTo(88f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
                        horizontalLineToRelative(0f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 88f)
                        verticalLineTo(224f)
                    }
                }.build()

        return _ArrowULeftDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowULeftDown: ImageVector? = null
