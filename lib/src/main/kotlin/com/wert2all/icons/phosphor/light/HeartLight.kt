package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.HeartLight: ImageVector
    get() {
        if (_HeartLight != null) {
            return _HeartLight!!
        }
        _HeartLight =
            ImageVector
                .Builder(
                    name = "Light.HeartLight",
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
                        moveTo(128f, 224f)
                        reflectiveCurveTo(24f, 168f, 24f, 102f)
                        arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 48f)
                        curveToRelative(22.59f, 0f, 41.94f, 12.31f, 50f, 32f)
                        curveToRelative(8.06f, -19.69f, 27.41f, -32f, 50f, -32f)
                        arcToRelative(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54f, 54f)
                        curveTo(232f, 168f, 128f, 224f, 128f, 224f)
                        close()
                    }
                }.build()

        return _HeartLight!!
    }

@Suppress("ObjectPropertyName")
private var _HeartLight: ImageVector? = null
