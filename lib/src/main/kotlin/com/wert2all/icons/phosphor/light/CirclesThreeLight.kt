package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.CirclesThreeLight: ImageVector
    get() {
        if (_CirclesThreeLight != null) {
            return _CirclesThreeLight!!
        }
        _CirclesThreeLight =
            ImageVector
                .Builder(
                    name = "Light.CirclesThreeLight",
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
                        moveTo(128f, 76f)
                        moveToRelative(-36f, 0f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(188f, 172f)
                        moveToRelative(-36f, 0f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(68f, 172f)
                        moveToRelative(-36f, 0f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
                    }
                }.build()

        return _CirclesThreeLight!!
    }

@Suppress("ObjectPropertyName")
private var _CirclesThreeLight: ImageVector? = null
