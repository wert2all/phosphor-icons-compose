package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.TrafficSignLight: ImageVector
    get() {
        if (_TrafficSignLight != null) {
            return _TrafficSignLight!!
        }
        _TrafficSignLight =
            ImageVector
                .Builder(
                    name = "Light.TrafficSignLight",
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
                        moveTo(88f, 152f)
                        verticalLineToRelative(-8f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
                        horizontalLineToRelative(56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(18.51f, 121.95f)
                        lineTo(121.95f, 18.5f)
                        arcTo(8.56f, 8.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 134.06f, 18.5f)
                        lineTo(237.5f, 121.95f)
                        arcTo(8.56f, 8.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 237.5f, 134.05f)
                        lineTo(134.06f, 237.5f)
                        arcTo(8.56f, 8.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 121.95f, 237.5f)
                        lineTo(18.51f, 134.05f)
                        arcTo(8.56f, 8.56f, 90f, isMoreThanHalf = false, isPositiveArc = true, 18.51f, 121.95f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 96f)
                        lineToRelative(24f, 24f)
                        lineToRelative(-24f, 24f)
                    }
                }.build()

        return _TrafficSignLight!!
    }

@Suppress("ObjectPropertyName")
private var _TrafficSignLight: ImageVector? = null
