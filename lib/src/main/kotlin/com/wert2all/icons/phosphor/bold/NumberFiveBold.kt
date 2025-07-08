package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.NumberFiveBold: ImageVector
    get() {
        if (_NumberFiveBold != null) {
            return _NumberFiveBold!!
        }
        _NumberFiveBold =
            ImageVector
                .Builder(
                    name = "Bold.NumberFiveBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 195.78f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.92f, -72.36f)
                        lineTo(104f, 48f)
                        horizontalLineToRelative(64f)
                    }
                }.build()

        return _NumberFiveBold!!
    }

@Suppress("ObjectPropertyName")
private var _NumberFiveBold: ImageVector? = null
