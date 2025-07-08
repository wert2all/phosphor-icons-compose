package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Shapes: ImageVector
    get() {
        if (_Shapes != null) {
            return _Shapes!!
        }
        _Shapes =
            ImageVector
                .Builder(
                    name = "Regular.Shapes",
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
                        moveTo(64f, 64f)
                        lineToRelative(-40f, 120f)
                        lineToRelative(80f, 0f)
                        lineToRelative(-40f, -120f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(156f, 76f)
                        moveToRelative(-44f, 0f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 88f, 0f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -88f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 152f)
                        horizontalLineToRelative(88f)
                        verticalLineToRelative(56f)
                        horizontalLineToRelative(-88f)
                        close()
                    }
                }.build()

        return _Shapes!!
    }

@Suppress("ObjectPropertyName")
private var _Shapes: ImageVector? = null
