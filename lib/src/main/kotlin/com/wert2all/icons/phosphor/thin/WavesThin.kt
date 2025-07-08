package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.WavesThin: ImageVector
    get() {
        if (_WavesThin != null) {
            return _WavesThin!!
        }
        _WavesThin =
            ImageVector
                .Builder(
                    name = "Thin.WavesThin",
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
                        moveTo(40f, 185.61f)
                        curveToRelative(72f, -59.69f, 104f, 56.47f, 176f, -3.22f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 129.61f)
                        curveToRelative(72f, -59.69f, 104f, 56.47f, 176f, -3.22f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 73.61f)
                        curveToRelative(72f, -59.69f, 104f, 56.47f, 176f, -3.22f)
                    }
                }.build()

        return _WavesThin!!
    }

@Suppress("ObjectPropertyName")
private var _WavesThin: ImageVector? = null
