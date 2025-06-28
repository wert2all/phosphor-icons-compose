package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.NumberFiveThin: ImageVector
    get() {
        if (_NumberFiveThin != null) {
            return _NumberFiveThin!!
        }
        _NumberFiveThin =
            ImageVector
                .Builder(
                    name = "NumberFiveThin",
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
                        moveTo(88f, 195.78f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.92f, -72.36f)
                        lineTo(104f, 48f)
                        horizontalLineToRelative(64f)
                    }
                }.build()

        return _NumberFiveThin!!
    }

@Suppress("ObjectPropertyName")
private var _NumberFiveThin: ImageVector? = null
