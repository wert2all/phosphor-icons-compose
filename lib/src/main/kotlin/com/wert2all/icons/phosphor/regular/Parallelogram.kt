package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Parallelogram: ImageVector
    get() {
        if (_Parallelogram != null) {
            return _Parallelogram!!
        }
        _Parallelogram =
            ImageVector
                .Builder(
                    name = "Regular.Parallelogram",
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
                        moveTo(24f, 208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.3f, -11.28f)
                        lineToRelative(64.8f, -144f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.81f, 48f)
                        horizontalLineTo(232f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.3f, 11.28f)
                        lineToRelative(-64.8f, 144f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.3f, 4.72f)
                        close()
                    }
                }.build()

        return _Parallelogram!!
    }

@Suppress("ObjectPropertyName")
private var _Parallelogram: ImageVector? = null
