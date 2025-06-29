package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.RadioactiveThin: ImageVector
    get() {
        if (_RadioactiveThin != null) {
            return _RadioactiveThin!!
        }
        _RadioactiveThin =
            ImageVector
                .Builder(
                    name = "RadioactiveThin",
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
                        moveTo(109.77f, 97f)
                        lineTo(83.82f, 52f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.55f, -2.54f)
                        arcTo(95.94f, 95.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 119.14f)
                        arcTo(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 128f)
                        horizontalLineTo(92f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(146.23f, 97f)
                        lineToRelative(26f, -44.94f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.55f, -2.54f)
                        arcTo(95.94f, 95.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 119.14f)
                        arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.86f)
                        horizontalLineTo(164f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(146f, 159.18f)
                        lineToRelative(25.83f, 44.73f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.56f, 11.26f)
                        arcToRelative(96.24f, 96.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80.54f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.56f, -11.26f)
                        lineTo(110f, 159.18f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 128f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                }.build()

        return _RadioactiveThin!!
    }

@Suppress("ObjectPropertyName")
private var _RadioactiveThin: ImageVector? = null
