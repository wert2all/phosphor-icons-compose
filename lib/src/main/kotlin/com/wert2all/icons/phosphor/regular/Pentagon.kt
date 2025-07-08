package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Pentagon: ImageVector
    get() {
        if (_Pentagon != null) {
            return _Pentagon!!
        }
        _Pentagon =
            ImageVector
                .Builder(
                    name = "Regular.Pentagon",
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
                        moveTo(35.27f, 93.93f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, 8.9f)
                        lineToRelative(32f, 107.62f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 216f)
                        horizontalLineTo(184f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.62f, -5.55f)
                        lineToRelative(32f, -107.62f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, -8.9f)
                        lineToRelative(-88f, -68.38f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.46f, 0f)
                        close()
                    }
                }.build()

        return _Pentagon!!
    }

@Suppress("ObjectPropertyName")
private var _Pentagon: ImageVector? = null
