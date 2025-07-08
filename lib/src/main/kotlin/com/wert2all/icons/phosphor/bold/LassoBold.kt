package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.LassoBold: ImageVector
    get() {
        if (_LassoBold != null) {
            return _LassoBold!!
        }
        _LassoBold =
            ImageVector
                .Builder(
                    name = "Bold.LassoBold",
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
                        moveTo(24f, 112f)
                        arcToRelative(104f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 208f, 0f)
                        arcToRelative(104f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -208f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(57.8f, 159.22f)
                        curveTo(69f, 118.43f, 128f, 121.63f, 128f, 181.44f)
                        curveToRelative(0f, 40.12f, -48f, 56.52f, -80f, 40.47f)
                    }
                }.build()

        return _LassoBold!!
    }

@Suppress("ObjectPropertyName")
private var _LassoBold: ImageVector? = null
