package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.Pinwheel: ImageVector
    get() {
        if (_Pinwheel != null) {
            return _Pinwheel!!
        }
        _Pinwheel =
            ImageVector
                .Builder(
                    name = "Pinwheel",
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
                        moveTo(94.68f, 27.15f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.57f, 97.73f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(27.15f, 145.32f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 97.73f, -35.57f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(145.32f, 212.85f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, -35.57f, -97.73f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(212.85f, 94.68f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, -97.73f, 35.57f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(164.48f, 164.48f)
                        lineTo(224f, 224f)
                    }
                }.build()

        return _Pinwheel!!
    }

@Suppress("ObjectPropertyName")
private var _Pinwheel: ImageVector? = null
