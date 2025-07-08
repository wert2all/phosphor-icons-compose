package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.FunctionThin: ImageVector
    get() {
        if (_FunctionThin != null) {
            return _FunctionThin!!
        }
        _FunctionThin =
            ImageVector
                .Builder(
                    name = "Thin.FunctionThin",
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
                        moveTo(72f, 128f)
                        lineTo(184f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 216f)
                        horizontalLineTo(85.29f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.49f, -26.28f)
                        lineTo(139.22f, 66.28f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 170.71f, 40f)
                        horizontalLineTo(200f)
                    }
                }.build()

        return _FunctionThin!!
    }

@Suppress("ObjectPropertyName")
private var _FunctionThin: ImageVector? = null
