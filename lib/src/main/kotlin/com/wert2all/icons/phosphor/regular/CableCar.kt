package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.CableCar: ImageVector
    get() {
        if (_CableCar != null) {
            return _CableCar!!
        }
        _CableCar =
            ImageVector
                .Builder(
                    name = "CableCar",
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
                        moveTo(16f, 72f)
                        lineTo(240f, 32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 104f)
                        lineTo(192f, 104f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 128f)
                        lineTo(216f, 192f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 216f)
                        lineTo(64f, 216f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
                        lineTo(40f, 128f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 104f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 168f)
                        lineTo(216f, 168f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 52f)
                        lineTo(128f, 104f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 104f)
                        lineTo(160f, 168f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 104f)
                        lineTo(96f, 168f)
                    }
                }.build()

        return _CableCar!!
    }

@Suppress("ObjectPropertyName")
private var _CableCar: ImageVector? = null
