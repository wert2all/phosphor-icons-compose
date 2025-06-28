package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.Belt: ImageVector
    get() {
        if (_Belt != null) {
            return _Belt!!
        }
        _Belt =
            ImageVector
                .Builder(
                    name = "Belt",
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
                        moveTo(144f, 128f)
                        lineTo(184f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 80f)
                        lineTo(176f, 80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 88f)
                        lineTo(184f, 168f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 176f)
                        lineTo(112f, 176f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 168f)
                        lineTo(104f, 88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 80f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 88f)
                        lineTo(8f, 88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 168f)
                        lineTo(8f, 168f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(248f, 88f)
                        lineTo(184f, 88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(248f, 168f)
                        lineTo(184f, 168f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 80f)
                        lineTo(56f, 176f)
                    }
                }.build()

        return _Belt!!
    }

@Suppress("ObjectPropertyName")
private var _Belt: ImageVector? = null
