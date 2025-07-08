package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.ArrowFatRightLight: ImageVector
    get() {
        if (_ArrowFatRightLight != null) {
            return _ArrowFatRightLight!!
        }
        _ArrowFatRightLight =
            ImageVector
                .Builder(
                    name = "Light.ArrowFatRightLight",
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
                        moveTo(136f, 32f)
                        lineToRelative(96f, 96f)
                        lineToRelative(-96f, 96f)
                        verticalLineTo(176f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(88f)
                        close()
                    }
                }.build()

        return _ArrowFatRightLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatRightLight: ImageVector? = null
