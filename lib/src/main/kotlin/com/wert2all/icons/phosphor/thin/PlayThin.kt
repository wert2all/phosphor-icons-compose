package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.PlayThin: ImageVector
    get() {
        if (_PlayThin != null) {
            return _PlayThin!!
        }
        _PlayThin =
            ImageVector
                .Builder(
                    name = "Thin.PlayThin",
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
                        moveTo(72f, 39.88f)
                        verticalLineTo(216.12f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.15f, 6.69f)
                        lineToRelative(144.08f, -88.12f)
                        arcToRelative(7.82f, 7.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.38f)
                        lineTo(84.15f, 33.19f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 39.88f)
                        close()
                    }
                }.build()

        return _PlayThin!!
    }

@Suppress("ObjectPropertyName")
private var _PlayThin: ImageVector? = null
