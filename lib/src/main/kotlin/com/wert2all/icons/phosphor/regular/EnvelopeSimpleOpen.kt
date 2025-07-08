package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.EnvelopeSimpleOpen: ImageVector
    get() {
        if (_EnvelopeSimpleOpen != null) {
            return _EnvelopeSimpleOpen!!
        }
        _EnvelopeSimpleOpen =
            ImageVector
                .Builder(
                    name = "Regular.EnvelopeSimpleOpen",
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
                        moveTo(32f, 96f)
                        verticalLineTo(200f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineTo(216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        verticalLineTo(96f)
                        lineTo(128f, 32f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 96f)
                        lineToRelative(-78.54f, 56f)
                        lineToRelative(-34.91f, 0f)
                        lineToRelative(-78.55f, -56f)
                    }
                }.build()

        return _EnvelopeSimpleOpen!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeSimpleOpen: ImageVector? = null
