package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.UserCircleDashed: ImageVector
    get() {
        if (_UserCircleDashed != null) {
            return _UserCircleDashed!!
        }
        _UserCircleDashed =
            ImageVector
                .Builder(
                    name = "UserCircleDashed",
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
                        moveTo(128f, 120f)
                        moveToRelative(-40f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
                    }
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
                        moveTo(152f, 221f)
                        arcToRelative(95.51f, 95.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
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
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(220.52f, 153.7f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28.32f, 45.67f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -128.4f, 0f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.48f, 153.7f)
                    }
                }.build()

        return _UserCircleDashed!!
    }

@Suppress("ObjectPropertyName")
private var _UserCircleDashed: ImageVector? = null
