package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.Tote: ImageVector
    get() {
        if (_Tote != null) {
            return _Tote!!
        }
        _Tote =
            ImageVector
                .Builder(
                    name = "Tote",
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
                        moveTo(209.67f, 208f)
                        horizontalLineTo(46.33f)
                        arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -7.07f)
                        lineToRelative(-14.25f, -120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8.93f)
                        horizontalLineTo(223.92f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8.93f)
                        lineToRelative(-14.25f, 120f)
                        arcTo(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 209.67f, 208f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 104f)
                        verticalLineTo(64f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 0f)
                        verticalLineToRelative(40f)
                    }
                }.build()

        return _Tote!!
    }

@Suppress("ObjectPropertyName")
private var _Tote: ImageVector? = null
