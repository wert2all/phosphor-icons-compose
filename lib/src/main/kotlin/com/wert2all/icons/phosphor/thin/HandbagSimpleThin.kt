package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.HandbagSimpleThin: ImageVector
    get() {
        if (_HandbagSimpleThin != null) {
            return _HandbagSimpleThin!!
        }
        _HandbagSimpleThin =
            ImageVector
                .Builder(
                    name = "HandbagSimpleThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(209.67f, 72f)
                        horizontalLineTo(46.33f)
                        arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 7.07f)
                        lineToRelative(-14.25f, 120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8.93f)
                        horizontalLineTo(223.92f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.93f)
                        lineToRelative(-14.25f, -120f)
                        arcTo(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 209.67f, 72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 72f)
                        verticalLineTo(64f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 0f)
                        verticalLineToRelative(8f)
                    }
                }.build()

        return _HandbagSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _HandbagSimpleThin: ImageVector? = null
