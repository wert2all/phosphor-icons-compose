package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CircleNotchDuotone: ImageVector
    get() {
        if (_CircleNotchDuotone != null) {
            return _CircleNotchDuotone!!
        }
        _CircleNotchDuotone =
            ImageVector
                .Builder(
                    name = "CircleNotchDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(128f, 128f)
                        moveToRelative(-96f, 0f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 40f)
                        arcToRelative(97f, 97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 88f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -192f, 0f)
                        arcTo(97f, 97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 40f)
                    }
                }.build()

        return _CircleNotchDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNotchDuotone: ImageVector? = null
