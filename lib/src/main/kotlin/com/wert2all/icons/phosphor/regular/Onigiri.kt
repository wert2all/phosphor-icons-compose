package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Onigiri: ImageVector
    get() {
        if (_Onigiri != null) {
            return _Onigiri!!
        }
        _Onigiri =
            ImageVector
                .Builder(
                    name = "Regular.Onigiri",
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
                        moveTo(88f, 224f)
                        verticalLineTo(168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineToRelative(56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(31.29f, 150.69f)
                        curveTo(11.45f, 182.66f, 34.44f, 224f, 72.08f, 224f)
                        horizontalLineTo(183.92f)
                        curveToRelative(37.64f, 0f, 60.63f, -41.34f, 40.79f, -73.31f)
                        lineToRelative(-55.93f, -96f)
                        curveTo(150f, 24.44f, 106f, 24.44f, 87.22f, 54.69f)
                        close()
                    }
                }.build()

        return _Onigiri!!
    }

@Suppress("ObjectPropertyName")
private var _Onigiri: ImageVector? = null
