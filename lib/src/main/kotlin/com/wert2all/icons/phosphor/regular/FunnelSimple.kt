package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.FunnelSimple: ImageVector
    get() {
        if (_FunnelSimple != null) {
            return _FunnelSimple!!
        }
        _FunnelSimple =
            ImageVector
                .Builder(
                    name = "Regular.FunnelSimple",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 136f)
                        lineTo(192f, 136f)
                    }
                    path(
                        fill = SolidColor(Color.Black),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 88f)
                        lineTo(232f, 88f)
                    }
                    path(
                        fill = SolidColor(Color.Black),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 184f)
                        lineTo(152f, 184f)
                    }
                }.build()

        return _FunnelSimple!!
    }

@Suppress("ObjectPropertyName")
private var _FunnelSimple: ImageVector? = null
