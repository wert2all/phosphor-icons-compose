package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.MegaphoneSimpleLight: ImageVector
    get() {
        if (_MegaphoneSimpleLight != null) {
            return _MegaphoneSimpleLight!!
        }
        _MegaphoneSimpleLight =
            ImageVector
                .Builder(
                    name = "Light.MegaphoneSimpleLight",
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
                        moveTo(226.24f, 145.68f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 138f)
                        verticalLineTo(102f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.76f, -7.68f)
                        lineToRelative(-176f, -54f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 48f)
                        verticalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.24f, 7.68f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 156.18f)
                        verticalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(152f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(69.09f)
                    }
                }.build()

        return _MegaphoneSimpleLight!!
    }

@Suppress("ObjectPropertyName")
private var _MegaphoneSimpleLight: ImageVector? = null
