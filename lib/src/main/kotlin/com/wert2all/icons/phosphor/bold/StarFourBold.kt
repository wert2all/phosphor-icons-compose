package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.StarFourBold: ImageVector
    get() {
        if (_StarFourBold != null) {
            return _StarFourBold!!
        }
        _StarFourBold =
            ImageVector
                .Builder(
                    name = "Bold.StarFourBold",
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
                        moveTo(159.82f, 159.82f)
                        lineToRelative(-24.34f, 66.94f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15f, 0f)
                        lineTo(96.18f, 159.82f)
                        lineTo(29.24f, 135.48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -15f)
                        lineTo(96.18f, 96.18f)
                        lineToRelative(24.34f, -66.94f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 0f)
                        lineToRelative(24.34f, 66.94f)
                        lineToRelative(66.94f, 24.34f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 15f)
                        close()
                    }
                }.build()

        return _StarFourBold!!
    }

@Suppress("ObjectPropertyName")
private var _StarFourBold: ImageVector? = null
