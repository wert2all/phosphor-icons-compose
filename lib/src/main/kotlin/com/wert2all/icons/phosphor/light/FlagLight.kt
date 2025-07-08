package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.FlagLight: ImageVector
    get() {
        if (_FlagLight != null) {
            return _FlagLight!!
        }
        _FlagLight =
            ImageVector
                .Builder(
                    name = "Light.FlagLight",
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
                        moveTo(48f, 224f)
                        lineTo(48f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 176f)
                        curveToRelative(64f, -55.43f, 112f, 55.43f, 176f, 0f)
                        verticalLineTo(56f)
                        curveTo(160f, 111.43f, 112f, 0.57f, 48f, 56f)
                    }
                }.build()

        return _FlagLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlagLight: ImageVector? = null
