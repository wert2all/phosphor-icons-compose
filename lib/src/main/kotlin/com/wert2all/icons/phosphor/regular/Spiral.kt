package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Spiral: ImageVector
    get() {
        if (_Spiral != null) {
            return _Spiral!!
        }
        _Spiral =
            ImageVector
                .Builder(
                    name = "Regular.Spiral",
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
                        moveTo(136f, 136f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, -64f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 72f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, 80f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -88f, -88f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, -96f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 144f)
                    }
                }.build()

        return _Spiral!!
    }

@Suppress("ObjectPropertyName")
private var _Spiral: ImageVector? = null
