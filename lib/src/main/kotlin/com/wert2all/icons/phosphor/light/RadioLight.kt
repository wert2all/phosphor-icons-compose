package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.RadioLight: ImageVector
    get() {
        if (_RadioLight != null) {
            return _RadioLight!!
        }
        _RadioLight =
            ImageVector
                .Builder(
                    name = "Light.RadioLight",
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
                        moveTo(32f, 72f)
                        horizontalLineTo(216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(72f)
                        arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 72f)
                        lineTo(192f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 136f)
                        moveToRelative(-32f, 0f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 104f)
                        lineTo(96f, 104f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 136f)
                        lineTo(96f, 136f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 168f)
                        lineTo(96f, 168f)
                    }
                }.build()

        return _RadioLight!!
    }

@Suppress("ObjectPropertyName")
private var _RadioLight: ImageVector? = null
