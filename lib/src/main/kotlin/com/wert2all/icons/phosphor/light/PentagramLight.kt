package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.PentagramLight: ImageVector
    get() {
        if (_PentagramLight != null) {
            return _PentagramLight!!
        }
        _PentagramLight =
            ImageVector
                .Builder(
                    name = "Light.PentagramLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(60.75f, 205.49f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.31f, 8.95f)
                        lineToRelative(155.63f, -112f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 88f)
                        horizontalLineTo(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.71f, 14.47f)
                        lineToRelative(155.63f, 112f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.31f, -8.95f)
                        lineTo(135.61f, 21.68f)
                        arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.22f, 0f)
                        close()
                    }
                }.build()

        return _PentagramLight!!
    }

@Suppress("ObjectPropertyName")
private var _PentagramLight: ImageVector? = null
