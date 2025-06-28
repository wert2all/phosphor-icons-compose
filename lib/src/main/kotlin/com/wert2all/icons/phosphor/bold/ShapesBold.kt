package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ShapesBold: ImageVector
    get() {
        if (_ShapesBold != null) {
            return _ShapesBold!!
        }
        _ShapesBold =
            ImageVector
                .Builder(
                    name = "ShapesBold",
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
                        moveTo(60f, 64f)
                        lineToRelative(-36f, 120f)
                        lineToRelative(72f, 0f)
                        lineToRelative(-36f, -120f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(158f, 74f)
                        moveToRelative(-42f, 0f)
                        arcToRelative(42f, 42f, 0f, isMoreThanHalf = true, isPositiveArc = true, 84f, 0f)
                        arcToRelative(42f, 42f, 0f, isMoreThanHalf = true, isPositiveArc = true, -84f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 156f)
                        horizontalLineToRelative(88f)
                        verticalLineToRelative(52f)
                        horizontalLineToRelative(-88f)
                        close()
                    }
                }.build()

        return _ShapesBold!!
    }

@Suppress("ObjectPropertyName")
private var _ShapesBold: ImageVector? = null
