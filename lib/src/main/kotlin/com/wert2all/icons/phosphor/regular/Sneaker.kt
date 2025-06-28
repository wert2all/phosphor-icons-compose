package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.Sneaker: ImageVector
    get() {
        if (_Sneaker != null) {
            return _Sneaker!!
        }
        _Sneaker =
            ImageVector
                .Builder(
                    name = "Sneaker",
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
                        moveTo(32f, 192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineTo(240f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        verticalLineTo(167.06f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.88f, -30.35f)
                        lineToRelative(-60.73f, -20.25f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 146.27f, 99.1f)
                        lineTo(123f, 44.75f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, -4.27f)
                        lineTo(37.27f, 68f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 75.54f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 168f)
                        lineTo(248f, 168f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(120f, 104f)
                        lineTo(144.55f, 95.07f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 80f)
                        lineTo(133.51f, 69.27f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 128f)
                        lineTo(166.61f, 116.87f)
                    }
                }.build()

        return _Sneaker!!
    }

@Suppress("ObjectPropertyName")
private var _Sneaker: ImageVector? = null
