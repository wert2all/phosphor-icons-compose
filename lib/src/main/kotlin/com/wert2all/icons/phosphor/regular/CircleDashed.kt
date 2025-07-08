package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.CircleDashed: ImageVector
    get() {
        if (_CircleDashed != null) {
            return _CircleDashed!!
        }
        _CircleDashed =
            ImageVector
                .Builder(
                    name = "Regular.CircleDashed",
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
                        moveTo(104f, 35f)
                        arcToRelative(95.51f, 95.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(35.49f, 102.3f)
                        arcToRelative(95.54f, 95.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -41.56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(59.49f, 195.27f)
                        arcToRelative(95.54f, 95.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -41.58f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 221f)
                        arcToRelative(95.51f, 95.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(220.51f, 153.7f)
                        arcToRelative(95.54f, 95.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 41.56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(196.51f, 60.73f)
                        arcToRelative(95.54f, 95.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 41.58f)
                    }
                }.build()

        return _CircleDashed!!
    }

@Suppress("ObjectPropertyName")
private var _CircleDashed: ImageVector? = null
