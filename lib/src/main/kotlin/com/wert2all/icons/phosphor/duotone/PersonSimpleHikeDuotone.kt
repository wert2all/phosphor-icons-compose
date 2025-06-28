package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.PersonSimpleHikeDuotone: ImageVector
    get() {
        if (_PersonSimpleHikeDuotone != null) {
            return _PersonSimpleHikeDuotone!!
        }
        _PersonSimpleHikeDuotone =
            ImageVector
                .Builder(
                    name = "PersonSimpleHikeDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(152f, 48f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(44f, 132f)
                        lineToRelative(24f, -56f)
                        lineToRelative(28f, 12f)
                        lineToRelative(-24f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 48f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 232f)
                        lineToRelative(0f, -56f)
                        lineToRelative(-42.46f, -30.33f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 232f)
                        verticalLineTo(144f)
                        curveToRelative(-40f, 0f, -38.06f, -24.33f, -56f, -39.91f)
                        arcToRelative(32.47f, 32.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.47f, -4.4f)
                        lineTo(72f, 232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(44f, 132f)
                        lineToRelative(24f, -56f)
                        lineToRelative(28f, 12f)
                        lineToRelative(-24f, 56f)
                        close()
                    }
                }.build()

        return _PersonSimpleHikeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleHikeDuotone: ImageVector? = null
